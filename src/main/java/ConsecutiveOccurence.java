import java.util.HashMap;
import java.util.Map;

public class ConsecutiveOccurence {
    
    public static void main(String[] args) {
        String s = "aabbbc";
        char prev = '*';
        int ans = 1;
        int count =1;
        char ansChar = '*';
        for(char c : s.toCharArray()){
            if(prev == c ){
                count+=1;
            } else {
                count = 1;
            }
            prev = c;
            if(ans < count) {
                ans = count;
                ansChar = c;
            }
        }
        System.out.println(ans);
        System.out.println(ansChar);
    }
}
