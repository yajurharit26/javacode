public class nqueens {
    // n queens in n rows
    public static void nQueensinNRows(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            nQueensinNRows(board, row+1);
            board[row][j] = 'x';
        }
    }
}
    public static void printBoard(char board[][]){
        System.out.println("--------------------------chess board-------------------------------------");
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
    }
    // check if the queens will attack eath other
    public static boolean isSafe(char board[][],int row,int col){
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        for (int i =  row-1,j = col-1; i >=0 && j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        for (int i = row-1,j = col+1; i >=0 && j< board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
            
        }
        return true;

    }
    // count ways
    static int count = 0;  
    public static void main(String[] args) {
        char board[][] = new char[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueensinNRows(board, 0);
        System.out.println(count);
    }
    
}
