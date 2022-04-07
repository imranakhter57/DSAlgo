import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findNumOfinserts {
    public static long minimumOperations(List<Integer> numbers) {
        // Write your code here
        List<Integer> sorted = new ArrayList<>();
        long ans = 0;
        for(Integer num : numbers){
            int pos = findPositionToInsert(sorted, num);
            ans += (Math.min(sorted.subList(0, pos).size(), sorted.subList(pos, sorted.size()).size())*2)+1;
            sorted.add(pos,num);
        }
        return ans;
    }

    public static int findPositionToInsert(List<Integer> sorted, int num){

        int start = 0;
        int end = sorted.size();
        while(start < end){
            int mid = start+end/2;
            if(sorted.get(0) > num){
                return 0;
            }
            if(sorted.get(sorted.size()-1) < num){
                return sorted.size()-1;
            }
            if((sorted.get(mid-1)<=num && sorted.get(mid)>=num) || (sorted.get(mid+1)>=num && sorted.get(mid)<=num)){
                return mid;
            }
            if(num < sorted.get(mid)){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(10, 6, 2, 3, 7, 1, 2);
        System.out.println(minimumOperations(in));
    }
}
