import java.util.function.Function;

public class SinglyLinkedList <T> {
    
    class Node{
        private T data;
        private Node next;
        public  Node(T data){
            this.data= data;
        }
    }
    public SinglyLinkedList(){
        
    }
    
    Function<Integer, Integer> fun = x->x*x;
    Node head,curr = null;
    
    public void add(T inp){
        Node newNode = new Node(inp);
        if(head == null){
           head = newNode;
           curr = newNode;
        } else {
            curr.next = newNode;
            curr = newNode;
        }
    }
    
    public Node reverse(Node head){
        Node pointer = head;
        if(pointer == null || pointer.next == null || pointer.next.next == null){
            return pointer;
        }
        
        Node prev = reverse(pointer.next);
        prev.next.next = prev;
        prev.next = null;
        return prev;
    }
}
