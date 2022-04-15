import com.sun.security.jgss.GSSUtil;
import java.util.HashMap;
import java.util.Map;

public class CountTheRabbits {
    public static void main(String[] args) {
        int[] answers = {3,3,3,3,3,3,3,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,0,0,1,1,1};
        Map<Integer,Integer> tracker = new HashMap<>();
        for(int ans: answers){
            tracker.put(ans+1, tracker.getOrDefault(ans+1,0)+1);
        }
        
        int ans = tracker.entrySet().stream().map(x->((int)Math.ceil(x.getValue()*1d/x.getKey()*1d)*x.getKey() )
        ).mapToInt(x->x).sum();
        System.out.println(ans);
    }
}
