import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        Map<Character, Integer> romToNumMapper = new HashMap<>(){{
           put('I',1);
           put('V',5);
           put('X',10);
           put('L',50);
           put('C',100);
           put('D',500);
           put('M',1000);
        }};
        String s ="CMXCVIII";
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(i< s.length()-1 &&romToNumMapper.get(s.charAt(i)) < romToNumMapper.get(s.charAt(i+1)) ){
                ans -=romToNumMapper.get(s.charAt(i));
            } else {
                ans +=romToNumMapper.get(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
    
}
