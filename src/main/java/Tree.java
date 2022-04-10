import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    
    Node root;
    class Node{
        int val;
        Node leftNode;
        Node rightNode;
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

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(10);
        tree.add(12);
        tree.add(8);
        tree.add(10);
        System.out.println(tree.isPresentUsingDFS(10));
        System.out.println(tree.isPresentUsingDFS(11));
        System.out.println(tree.isPresentUsingDFS(12));
    }
}
