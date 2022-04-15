import java.util.Arrays;
import java.util.PriorityQueue;

public class CostOfNRope {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int n = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Adding items to the pQueue
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        // Initialize result
        int res = 0;

        // While size of priority queue
        // is more than 1
        while (pq.size() > 1) {
            // Extract shortest two ropes from pq
            int first = pq.poll();
            int second = pq.poll();

            // Connect the ropes: update result
            // and insert the new rope to pq
            res += first + second;
            pq.add(first + second);
        }

        System.out.println(res);
    }
}
