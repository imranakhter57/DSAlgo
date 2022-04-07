import java.util.Stack;

public class QueueUsingStack<T> {
    
    private Stack<T> q;
    
    public QueueUsingStack(){
        q = new Stack<>();
    }
    
    public void add(T item){
        q.push(item);
    }
    
    public T remove(){
        Stack<T> q1 = new Stack<>();
        while (!q.empty()){
            q1.push(q.pop());
        }
        T res = q1.pop();
        
        while (!q1.empty()){
            q.push(q1.pop());
        }
       return res;
    }

    public static void main(String[] args) {
        QueueUsingStack<String> q = new QueueUsingStack<>();
        q.add("a");
        q.add("b");
        q.add("c");
        System.out.println(q.remove());
        q.add("d");
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
