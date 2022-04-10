import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void printSubSeq(String s, String ans,List<String> res){
        if(s.length() == 0){
            res.add(ans);
            return;
        }
        printSubSeq(s.substring(1),ans+s.charAt(0),res);
        printSubSeq(s.substring(1),ans,res);
    }
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        printSubSeq("abcded","",res);
        System.out.println(res);
    }
}
