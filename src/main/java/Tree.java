import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    
    Node root;
    class Node{
        public int val;
        public Node leftNode;
        public Node rightNode;
        public Node(int val){
            this.val=val;
        }
    }
    
    private Node addData(Node curr,int val){
        Node node = new Node(val);
        if(curr == null){
            if(this.root == null)
                this.root =node;
            return node;
        } else {
            if(val == curr.val){
                return curr;
            } 
             else if(val> curr.val){
                 curr.rightNode = addData(curr.rightNode, val);
            } else if (val< curr.val){
                curr.leftNode = addData(curr.leftNode, val);
            } else {
                 return curr;
            }
        }
        return curr;
    }
    public void add(int val){
        addData(root, val);
    }
    
    public boolean isPresentUsingBFS(int val){
        Queue<Node> bfs =  new ArrayDeque<>();
        bfs.add(this.root);
        List<Integer> visited = new ArrayList<>();
        while(!bfs.isEmpty()){
            Node value = bfs.poll();
            if(bfs.contains(value)){
                continue;
            }
            visited.add(value.val);
            if(val==value.val){
                return true;
            }
            if(value.rightNode!= null)
                bfs.add(value.rightNode);
            if(value.leftNode != null)
                bfs.add(value.leftNode);
        }
        return false;
    }
    
    public boolean isPresentUsingDFS(int val){
        Stack<Node> dfs =  new Stack<>();
        dfs.push(this.root);
        List<Integer> visited = new ArrayList<>();
        while(!dfs.isEmpty()){
            Node curr = dfs.pop();
            if(visited.contains(curr.val)){
                continue;
            }
            
            if(curr.val == val){
                return true;
            }
            
            if(curr.leftNode != null)
                dfs.push(curr.leftNode);
            if(curr.rightNode != null)
                dfs.push(curr.rightNode);
        }
        return false;
    }

    public static boolean isSameTree(Node p, Node q) {
        Queue<Node> qp = new ArrayDeque<>();
        Queue<Node> qq = new ArrayDeque<>();
        qp.add(p);
        qq.add(q);
        while(!qp.isEmpty() && !qq.isEmpty()){
            Node currP = qp.remove();
            Node currQ = qq.remove();
            if(currP.val != currQ.val){
                return false;
            }


            if(currP.leftNode != null){
                qp.add(currP.leftNode);
            }
            if(currQ.leftNode != null){
                qq.add(currQ.leftNode);
            }

            if(currP.rightNode != null){
                qp.add(currP.rightNode);
            }

            if(currQ.rightNode != null){
                qq.add(currQ.rightNode);
            }
        }

        return true;
    }

    public static boolean isSymmetricTree(Node p, Node q) {
        Stack<Node> qp = new Stack<>();
        Stack<Node> qq = new Stack<>();
        qp.push(p);
        qq.push(q);
        while(!qp.isEmpty() && !qq.isEmpty()){
            Node currP = qp.pop();
            Node currQ = qq.pop();
            if(currP.val != currQ.val){
                return false;
            }


            if(currP.leftNode != null){
                qp.add(currP.leftNode);
            }
            if(currP.rightNode != null){
                qp.add(currP.rightNode);
            }
            
            if(currQ.rightNode != null){
                qq.add(currQ.rightNode);
            }
            if(currQ.leftNode != null){
                qq.add(currQ.leftNode);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(2);
        tree.add(2);
        System.out.println(isSymmetricTree(tree.root, tree.root));
        
    }
}
