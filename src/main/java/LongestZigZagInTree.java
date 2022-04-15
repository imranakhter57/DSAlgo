public class LongestZigZagInTree {
    private TreeNode root;
    long count;
    public class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(Integer val) {
            this.val = val;
        }

    }
    private TreeNode addData(TreeNode curr, Integer val){
        TreeNode node = new TreeNode(val);
        if(curr == null){
            if(this.root == null)
                this.root =node;
            return node;
        } else {
            if(val == curr.val){
                return curr;
            }
            else if(val> curr.val){
                curr.right = addData(curr.right, val);
            } else if (val< curr.val){
                curr.left = addData(curr.left, val);
            } else {
                return curr;
            }
        }
        return curr;
    }
    public void add(Integer val){
        addData(root, val);
    }
    
    public long countLongestPath(TreeNode node,String dir){
        if(node == null){
            return 0;
        }
        long l = countLongestPath(node.left,"lt");
        long r = countLongestPath(node.right,"rt");

        count = Math.max(count,Math.max(l,r));

        if(dir.equalsIgnoreCase("lt"))return r+1;
        else return l+1;
    }

    public static void main(String[] args) {
        LongestZigZagInTree tree= new LongestZigZagInTree();
        tree.add(100);
        tree.add(90);
        tree.add(99);
        tree.add(91);
        tree.add(98);
        tree.add(92);
        tree.add(97);
        tree.add(93);
        System.out.println(tree.countLongestPath(tree.root,""));
    }
}
