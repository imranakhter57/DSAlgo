import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QueenNString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner s = new Scanner(System.in);
        List<String> ans = new ArrayList<>();
        int n = s.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "",0,ans);
        for(int i =0; i<n; i++){
            System.out.println(ans.get(i));
        }
        
    }
    
    public static void printNQueens(int[][] chess, String qsf, int row, List<String> ans){
        if(row==chess.length){
            for(int i =0; i <row; i++){
                ans.add(Arrays.toString(chess[i]).replace(",","").replace("[","").replace("]",""));
            }
            return;
        }
        for(int col=0;col< chess.length; col++){
            if(isQueenSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1, ans);
                chess[row][col] = 0;
            }
        }
    }
    
    public static boolean isQueenSafe(int[][] chess, int row, int col){
        boolean isSafe = true;
        for(int i= row-1, j=col; i>=0; i--){
            if(chess[i][j] ==1) 
                isSafe=false;
            
        }
        
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] ==1)
                isSafe=false;
        }

        for(int i= row-1, j=col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] ==1)
                isSafe=false;
        }
        return isSafe;
    }
}
