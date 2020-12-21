import java.util.Scanner;

public class TicTaeToeGame {
    public  static void main(String[]args)
    {
        System.out.println("Welcome to tic-tae-toe game");
        char[] board= createBoard();
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';

    }
    //uc1 - create empty 10 size char array for board
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    //uc2 choose player letter X or O
    private static char chooseUserLetter(Scanner userInput){
        System.out.println("Choose your letter");
        return userInput.next().toUpperCase().charAt(0);

    }
}
