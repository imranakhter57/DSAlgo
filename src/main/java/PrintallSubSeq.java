import java.util.ArrayList;
import java.util.List;

public class PrintallSubSeq {
    public static void main(String[] args) {
        String S = "abccbc";
        int ans =0;
        List<String> pallindromes = new ArrayList<>();
        List<String> subseqs = new ArrayList<>();
        for(int i=0; i<S.length();i++){
            for(int j = i+1;j<=S.length();j++){
                subseqs.add(S.substring(i,j));
                if(isPallindrome(S.substring(i,j))){
                    ans+=1;
                    pallindromes.add(S.substring(i,j));
                }
            }
        }
        System.out.println(subseqs);
        System.out.println(ans);
        System.out.println(pallindromes);
    }
    
    /*public static boolean isPallindrome(String s){
        if(s.length()==1){return true;}
        if(s.length() %2 ==0){return  false;}
        int mid = s.length()/2;
        for(int i=mid;i > 0;i--){
            if(s.charAt(i-1) != s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }*/
    
    public static boolean isPallindrome(String s){
        if(s.length() ==1 || s.length() ==0){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPallindrome(s.substring(1,s.length()-1));
        } else {
            return false;
        }
    }
    
}
