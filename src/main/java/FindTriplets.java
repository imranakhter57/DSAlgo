import java.util.HashSet;
import java.util.Set;

public class FindTriplets {
    public static void main(String[] args) {
        int[] A = {1,4,45,6,10,8};
        int n = A.length;
        int X = 22;
        
        for(int i=0; i<n-2;i++){
            Set<Integer> tracker = new HashSet<>();
            int curr_sum = X - A[i];
            for(int j=i+1;j<n;j++){
                if(tracker.contains(curr_sum-A[j])){
                    System.out.println(String.format("triplets are %d, %d and %d",A[i],A[j],(curr_sum-A[j])));
                    return;
                }
                tracker.add(A[j]);
            }
        }
    }
}
