import java.util.HashSet;
import java.util.Set;

public class Repeating {
    
    public static void main(String[] args) {
        Set<Character> tracker = new HashSet<>();
        String ans = "";
        String s = "ABDEFGABEF";
        int startInd = 0;
        int endInd=1;
        for(int i =0; i< s.length(); i++){
            if(tracker.add(s.charAt(i)) ){
                if(s.substring(startInd,endInd).length() > ans.length())
                    ans= s.substring(startInd,endInd);
            } else {
                tracker.clear();
                tracker.add(s.charAt(i));
                startInd =i;
            }
            endInd++;
        }
        System.out.println(ans);
    }
}
