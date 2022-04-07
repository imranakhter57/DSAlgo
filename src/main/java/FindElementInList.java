import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindElementInList {
    
    public static void findElement(List<Integer> data, int elem, int start, int end){
        if (end >= start) {
            int mid = start + (end - start) / 2;
            
            if (data.get(mid) == elem) {
                System.out.println("Element found at "+mid);
                return;
            }
            if (data.get(mid) > elem)
                findElement(data, elem, start, mid - 1);
            
            findElement(data, elem,mid + 1, end);
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(33);
        data.add(25);
        data.add(23);
        data.add(10);
        data.add(9);
        data.add(4);
        data.add(3);
        Collections.sort(data);
        findElement(data,23, 0,data.size()-1);
    }
}
