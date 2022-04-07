import java.util.Collections;
import java.util.PriorityQueue;

public class PairsOfArrayEl1gtEl2 {

    public static void main(String[] args) {
        int[] A = {20, 30, 50};
        int[] B = {60, 40, 25};
        int N = A.length;
        PriorityQueue<Integer> pqA = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqB = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i< A.length; i++){
            pqA.add(A[i]);
        }

        for(int i = 0; i< B.length; i++){
            pqB.add(B[i]);
        }
        
        int count = 0;
        for(int i =0; i<A.length; i++){
            if(pqA.peek().compareTo(pqB.peek()) ==1){
                count++;
                pqA.poll();
                pqB.poll();
            } else {
                if(pqB.isEmpty()){
                    break;
                }
                pqB.poll();
            }
        }
        System.out.println(count);
    }
}
