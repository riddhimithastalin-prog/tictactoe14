import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        // UC8: Continuous Turn-Based Game Loop
        while (true) {

            // Player Turn
            playerMove(board);
            printBoard(board);

            if (checkWinner(board, 'X')) {
                System.out.println("Player Wins!");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("It's a Draw!");
                break;
            }

            // Computer Turn
            computerMove(board);
            printBoard(board);

            if (checkWinner(board, 'O')) {
                System.out.println("Computer Wins!");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("It's a Draw!");
                break;
            }
        }
    }

    // Player Move
    public static void playerMove(char[][] board) {
        // Your UC5 code here
    }

    // Computer Move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1;

            int[] position = getRowColumn(slot);

            int row = position[0];
            int col = position[1];

            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                System.out.println("Computer chose slot " + slot);
                break;
            }
        }
    }

    // Convert slot to row and column
    public static int[] getRowColumn(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    // Print Board
    public static void printBoard(char[][] board) {
        // Your printBoard() code here
    }

    // Check Winner
    public static boolean checkWinner(char[][] board, char symbol) {
        // Your UC9 code here
        return false;
    }

    // Check Draw
    public static boolean isBoardFull(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}