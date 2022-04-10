import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        List<List<Integer>> adj = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(),Arrays.asList(4),Arrays.asList(),Arrays.asList());
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> visited = new LinkedList<>();
        visited.add(0);
        
        while(!visited.isEmpty()){
            Integer vis = visited.poll();
            if(ans.contains(vis)){
                continue;
            }
            ans.add(vis);
            adj.get(vis).forEach(x-> visited.add(x));
        }
        System.out.println(ans);
    }
}
