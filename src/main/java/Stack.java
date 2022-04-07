import java.lang.reflect.Array;

public class Stack<T> {
    private final int MAX =1000;
    private T[] dataArray;
    private int size;
    private int top;
    public Stack(int size){
        if(this.MAX < size){
            System.out.println("Size cannot be more than 1000");
            throw new StackOverflowError();
        }
        this.size = size;
        dataArray= (T[])new Object[size];
        top = -1;
    }
    public  boolean isEmpty(){
        return top<0;
    }
    public boolean push(T data){
        if(top >= this.MAX ){
            System.out.println("Stack over flow");
            return false;
        }
        dataArray[++top] = data;
        System.out.println("data inserted");
        return true;
    }
    
    public T pop(){
        if(top <0){
            System.out.println("Stack under flow");
            return null;
        }
        return dataArray[top--];
    }
    
    public T peek(){
        if(top <0){
            System.out.println("Stack under flow");
            return null;
        }
        return dataArray[top];
    }
}
