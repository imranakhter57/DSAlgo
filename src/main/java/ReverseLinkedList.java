public class ReverseLinkedList<T> {
    Node head,tail=null;
    class Node{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
        }
    }
    
    public void add(T data){
        Node newNode =  new Node(data);
        if(head == null ){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }
    public void reverse(){
        reverse(this.head);
    }
    private Node reverse(Node head){
        if( head == null || head.next == null){
            this.head=head;
            return head;
        }
        
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return  newNode;
    }

    public void display(){
        display(this.head);
    }
    private void display(Node head){
        if(head== null){
            return;
        }
        System.out.println(head.data);
        display(head.next);
    }
    
    public static void main(String[] args) {
        ReverseLinkedList<String> reverse = new ReverseLinkedList<>();
        reverse.add("Imran");
        reverse.add("Akhtar");
        reverse.add("Alia");
        reverse.add("Urooj");
        reverse.reverse();
        reverse.display(); 
        
        reverse.reverse();
        reverse.display();
    }
}
