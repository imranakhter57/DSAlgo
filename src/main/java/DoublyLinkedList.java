public class DoublyLinkedList<T> {
    
    private Node head, tail = null;
    class Node{
        T data;
        Node prev;
        Node next;
        public Node(T data){
            this.data=data;
        }
    }
    
    public void addNode(T data){
        Node newNode = new Node(data);
        if(head ==null){
            head=tail= newNode;
            head.prev = null;
            tail.next  = null;
        } else {
            tail.next=newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list");
        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList<String> str = new DoublyLinkedList<>();
        str.addNode("Imran");
        str.addNode("Urooj");
        str.addNode("Alia");
        str.addNode("Akhtar");
        str.display();
    }
}
