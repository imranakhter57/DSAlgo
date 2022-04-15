import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QueenNString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int n = 4;
        int[][] chess = new int[4][4];
        List<int[]> ans = new ArrayList<>();
        printNQueen(chess,0,ans);
        for(int i=0;i<chess.length;i++){
            for (int j=0;j< chess.length; j++){
                System.out.print(ans.get(i)[j]);
            }
            System.out.println();
        }
    }
    
    public static void printNQueen(int[][] chess, int r, List<int[]> ans){
        if(r == chess.length){
            for(int i=0;i<chess.length;i++){
                ans.add(chess[i].clone());
            }
            return;
        }
        
        for(int i=0;i<chess.length;i++){
            if(isQueenSafe(chess,r,i)) {
                chess[r][i] = 1;
                printNQueen(chess, r + 1, ans);
                chess[r][i] = 0;
            }
        }
    }
    
    private static boolean isQueenSafe(int[][] chess , int r, int c){
        for(int i=r-1;i>=0;i--){
            if(chess[i][c] == 1){
                return false;
            }
        }
        
        for(int i=r-1,j=c-1; i>=0&&j>=0; i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i=r-1,j=c+1; i>=0&&j<chess.length; i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        return true;
    }
}
