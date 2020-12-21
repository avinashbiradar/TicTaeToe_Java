public class TicTaeToeGame {
    public  static void main(String[]args)
    {
        System.out.println("Welcome to tic-tae-toe game");
        char[] board= createBoard();
    }
    //uc1 - create empty 10 size char array for board
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
}
