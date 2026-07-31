import java.util.Random;
import java.util.Scanner;

public class Main {

    // UC3 - Accept User Slot Input
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        return scanner.nextInt();
    }

    // UC4 - Convert Slot Number to Row and Column
    public static int[] getRowColumn(int slot) {
        int row = (slot - 1) / 3;
        int column = (slot - 1) % 3;

        return new int[]{row, column};
    }

    // UC5 - Validate User Move
    public static boolean isValidMove(char[][] board, int row, int column) {

        // Check boundaries
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }

        // Check if the cell is empty
        if (board[row][column] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // UC1 - Create Board
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display Board
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // UC2 - Toss
        Random random = new Random();
        int toss = random.nextInt(2);

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("\nToss Result:");
        System.out.println(currentPlayer + " starts first.");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);

        // UC3
        int slot = getUserSlot();

        // UC4
        int[] position = getRowColumn(slot);
        int row = position[0];
        int column = position[1];

        System.out.println("Row = " + row);
        System.out.println("Column = " + column);

        // UC5
        if (isValidMove(board, row, column)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}