import java.util.HashMap;
import java.util.Map;

public class SmallestString {
    
    public static void main(String[] args) {
        int n =5;
        int k =73;
        char[] ans = new char[n];
        for(int i=0;i<n;i++){
            ans[i] = 'a';
            k--;
        }
        while(k >0){
            if(k>25){
                ans[--n] +=25;
                k-=25;
            } else {
                ans[--n]+=k;
                k = 0;
            }
        }
        System.out.println(String.valueOf(ans));
    }
}
