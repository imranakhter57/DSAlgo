package TicTacToe;

public class TicTacToe {
    private final int[][] board;
    private int n;
    
    public TicTacToe(final int n){
        this.n =n;
        board = new int[n][n];
    }
    
    public int move(int player, int row, int col){
        if(row<0 || col<0 || row >=this.n|| col>=this.n){
            throw new IllegalArgumentException("Move out of boundary");
        } else if(board[row][col] != 0){
            throw new IllegalArgumentException("Square is already occupied");
        } else if(player!=1 && player !=2){
            throw new IllegalArgumentException("Invalid player");
        } else {
            board[row][col] = player;
            boolean winRow,winCol, winDia,winRevDia;
            winCol=winRow=winRevDia=winDia = true;
            for (int i=0;i<n;i++){
                if(board[row][i] != player){
                    winCol = false;
                }
                if(board[i][col] != player){
                    winRow = false;
                }
                
                if(board[i][i] != player){
                    winDia = false;
                }

                if(board[i][n-1-i] != player){
                    winRevDia = false;
                }
            }
            if(winRow || winCol || winDia || winRevDia){
                return player;
            } else 
                return 0;
        }
    }
}
