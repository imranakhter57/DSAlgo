import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class FindNoOfIsland {
    
    static class PieceOfLand{
        int val;
        int row;
        int col;
        public PieceOfLand(int val, int row, int col){
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) {
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 0, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 0, 0, 0, 0, 0 },
                                  { 1, 0, 1, 0, 1 } };
        int row = M.length;
        int col = M[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(M[i][j] ==1 && !visited[i][j]){
                    PieceOfLand newPiece = new PieceOfLand(M[i][j],i,j);
                    dfs(newPiece,M,visited);
                }
            }
            
        }
    }
    
    public static void dfs(PieceOfLand piece, int[][] M,boolean[][] visited){
        Stack<PieceOfLand> dfs = new Stack<>();
        dfs.push(piece);
        while(!dfs.isEmpty()){
            PieceOfLand currPiece = dfs.pop();
            if(visited[currPiece.row][currPiece.col]){
                continue;
            }
            visited[currPiece.row][currPiece.col] = true;
            if(currPiece.val ==0){
                continue;
            }
            for(int i=M.length-1;i>0;i--){
                PieceOfLand newPiece = new PieceOfLand(M[currPiece.row+1][i], currPiece.row+1, i);
                dfs.push(newPiece);
            }
            
        }
    } 
    
    
    
}
