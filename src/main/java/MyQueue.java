public class MyQueue<T> {
    
    private int size;
    private T[] dataArr;
    private int pointer;
    public MyQueue(int size){
        this.size = size;
        this.pointer = -1;
        dataArr = (T[]) new Object[size];
    }
    
    public boolean add(T data){
        if(pointer == size-1 ){
            System.out.println("Queue is full");
            return false;
        }
        dataArr[++pointer] = data;
        return true;
    }
    
    public T remove(){
        if(pointer ==-1){
            System.out.println("Queue is empty, nothing to remove");
            return null;
        }
        return dataArr[pointer--];
    }
    
    public int getSize(){
        return pointer;
    }
}
