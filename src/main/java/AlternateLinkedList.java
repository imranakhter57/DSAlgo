public class AlternateLinkedList {
    
    private Node root,curr;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    
    public void add(int val){
        Node newNode = new Node(val);
        if(root ==null){
            root = newNode;
            curr = newNode;
        } else {
            curr.next = newNode;
            curr = newNode;
        }
    }
    
    public Node findMidVal(){
        Node slow = this.root;
        if(slow == null){
            return  null;
        }
        Node fast = slow.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private Node reverse(Node curr){
        if(curr ==null || curr.next == null){
            this.root = curr;
            return curr;
        }
        
        Node newNode= reverse(curr.next);
        curr.next.next = curr;
        curr.next = null;
        return newNode;
    }
    public void reverse(){
        reverse(this.root);
    }
    
    public void alternateList(){
        Node first = this.root;
        Node mid = findMidVal();
        Node last = mid.next;
        mid.next = null;
        last = reverse(last);
        Node node = new Node(0);
        Node curr = node;
        while(first != null || last != null){
            if(first != null){
                curr.next = first;
                curr = curr.next;
                first = first.next;
            }
             if(last != null){
                 curr.next = last;
                 curr= curr.next;
                 last = last.next;
             }
        }
        this.root =  node.next;
    }

    public static void main(String[] args) {
        AlternateLinkedList linkedList = new AlternateLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
//        linkedList.reverse();
        Node mid = linkedList.findMidVal();
        linkedList.alternateList();
        System.out.println(mid.val);
    }
}
