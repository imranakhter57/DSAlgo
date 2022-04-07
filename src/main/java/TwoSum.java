import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        Map<Integer,Integer> track = new HashMap<>(); 
        int[] ans= new int[2];
        for(int i=0; i < nums.length; i++){
            if(track.containsKey(target - nums[i])){
                ans[0]=track.get(target-nums[i]);
                ans[1] = i;
                break;
            } 
            track.put(nums[i],i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
