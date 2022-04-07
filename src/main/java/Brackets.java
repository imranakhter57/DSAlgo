import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        int ans = 0;
        String s = "(()(()))";
        Stack<Character> tracker = new Stack<>();
        int count = 0;
        for(Character c:s.toCharArray()){
            if(c.equals('(')){
                tracker.push(c);
                if(count>0) {
                    ans += Math.pow(2,count - 1);
                    count = 0;
                }
            }else {
                if(!tracker.isEmpty()){
                    tracker.pop();
                    if(tracker.isEmpty()){
                        if(count>0) {
                            ans += Math.pow(2,count - 1);
                            count = 0;
                            ans*=2;
                        } else {
                            ans+=1;
                        }
                        
                    } else 
                        count+=1;
                }
            }
        }
        System.out.println(ans);
    }
}
