import java.util.Arrays;
import java.util.List;

public class MaxSum {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,9,2,-2,2,5,-1,6);
        int ans = 0;
        int tracker = 0;
        for(Integer num: data){
            if(num < 0){
                ans = Math.max(ans,tracker);
                tracker = 0;
            } else {
                tracker+=num;
            }
        }
        ans = Math.max(ans,tracker);
        System.out.println(ans);
    }
}
