import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class WaterDrop {
    public static void main(String[] args) {
        int len = 12;
        int [] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        Map<Integer, Integer> timeTracker = new TreeMap<>();
        for(int i=0; i<position.length;i++){
            timeTracker.put(position[i],(len- position[i])/speed[i]);
        }
        List<Integer> tracker =timeTracker.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        int ans = 0;
        int curr_max = tracker.get(tracker.size()-1);
        for (int i = position.length - 2; i >= 0; i--)
        {

            // checks for next slower drop
            if (tracker.get(i) >= curr_max)
            {
                ans++;
                curr_max = tracker.get(i);
            }
        }
        System.out.println("check point");
    }
}
