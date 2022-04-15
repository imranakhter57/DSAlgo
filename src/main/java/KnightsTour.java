public class KnightsTour {

    private static void printKnightsTour(int[][] chess, int r, int c, int move){
        if(r< 0||c<0||r>= chess.length || c >= chess.length || chess[r][c] > -1){
            return;
        } else if( move == chess.length * chess.length){
            chess[r][c] = move;
            display(chess);
            chess[r][c] = -1;
        }
        chess[r][c] = move;
        printKnightsTour(chess,r-1,c+2,move+1);
        printKnightsTour(chess,r-2,c+1,move+1);
        printKnightsTour(chess,r-2,c-1,move+1);
        printKnightsTour(chess,r-1,c-2,move+1);
        
        printKnightsTour(chess,r+1,c+2,move+1);
        printKnightsTour(chess,r+2,c+1,move+1);
        printKnightsTour(chess,r+1,c-2,move+1);
        printKnightsTour(chess,r+2,c-1,move+1);
        chess[r][c] = -1;
    }
    
    private static void display(int[][] chess){
        for (int x = 0; x < chess.length; x++) {
            for (int y = 0; y < chess.length; y++) {
                System.out.print(chess[x][y]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =7;
        int[][] chess = new int[n][n];
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++)
                chess[x][y] = -1;
        printKnightsTour(chess,0,0,0);
    }
}
