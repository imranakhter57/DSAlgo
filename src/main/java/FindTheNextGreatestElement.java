import java.util.Stack;

public class FindTheNextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        Stack<Integer> tracker = new Stack<>();
        tracker.push(arr[0]);
        for(int i=1;i< arr.length;i++){
            int next = arr[i];
            if(!tracker.isEmpty()) {
                int element = tracker.pop();
                while (element < next) {
                    System.out.println(element+ "------->"+next);
                    if(tracker.isEmpty())
                        break;
                    element = tracker.pop();
                }
                if(element>next){
                    tracker.push(element);
                }
            }
            tracker.push(next);
        }
    }
}
