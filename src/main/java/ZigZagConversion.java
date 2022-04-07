import java.util.Arrays;

public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int n = 4;
        int div = 2*n -2;
//        int mulForCol = 
        
        char[][] ans = new char[n][n];
        Arrays.stream(ans).forEach(i->Arrays.fill(i,' '));
        int row = 0;
        int col = 0;
        for(int i=0; i< s.length();i++){
            
        }
    }
}
