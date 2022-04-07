import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String s= "";
        String ans = "";
        int max = 0;
        for(int i=0; i <s.length();i++){
            if(ans.contains(String.valueOf(s.charAt(i)))){
                ans = ans.substring(ans.indexOf(s.charAt(i))+1);
            }
            ans+=s.charAt(i);
            max = Math.max(ans.length(),max);
        }
        System.out.println(max);
    } 
  
}
