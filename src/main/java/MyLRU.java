import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public class MyLRU {
    private int MAX_CAPACITY;
    private Queue<Integer>  q;
    Map<Integer,Integer> data = new HashMap<>();
    
    public MyLRU(int capacity){
        MAX_CAPACITY = capacity;
        q = new ArrayDeque<>(4);
    }
    
    public void update(int value){
        if(!q.contains(value)){
            if(q.size()==MAX_CAPACITY){
                q.remove();
            }
        } else {
            q.remove(value);
        }
        q.add(value);
    }

    public  int get(int key)
    {
        if(data.containsKey(key)) {
            if (!q.contains(key)) {
                if (q.size() == MAX_CAPACITY) {
                    q.remove();

                }
            } else {
                q.remove(key);
            }
            q.add(key);
            return data.get(key);
        }
        return -1;
    }
    
    public  void set(int key, int value)
    {
        if(!q.contains(key)){
            if(q.size()==MAX_CAPACITY){
                data.remove(q.remove());

            }
        } else {
            q.remove(key);
        }
        q.add(key);
        data.put(key,value);
    }

    public void display(){
        Iterator itr =  q.iterator();
        while(itr.hasNext()){
            System.out.println(data.get(itr.next()));
        }
    }
    
    public static void main(String[] args) {
        MyLRU cache = new MyLRU(2);
        cache.set(1,2);
        cache.set(2,3);
        cache.set(1,5);
        cache.set(4,5);
        cache.set(6,7);
        cache.set(1,2);
        
        System.out.println("data is :"+cache.get(3));
        /*int[] arr = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
        
        for(int a :arr){
            cache.update(a);
        }*/
        /*cache.update(1);
        cache.update(2);
        cache.update(3);
        cache.update(1);
        cache.update(4);
        cache.update(5);
        cache.update(2);
        cache.update(2);
        cache.update(1);*/
        cache.display();
    }
}
