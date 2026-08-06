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

        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }

        if (board[row][column] != '-') {
            return false;
        }

        return true;
    }

    // UC6 - Place Move on Board
    public static void placeMove(char[][] board, int row, int column, char symbol) {
        board[row][column] = symbol;
    }

    // Display Board
    public static void printBoard(char[][] board) {
        System.out.println("\nUpdated Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // UC1 - Create Board
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        printBoard(board);

        // UC2 - Toss
        Random random = new Random();
        int toss = random.nextInt(2);

        String currentPlayer;
        char currentSymbol;

        if (toss == 0) {
            currentPlayer = "Player 1";
            currentSymbol = 'X';
        } else {
            currentPlayer = "Player 2";
            currentSymbol = 'X';
        }

        System.out.println("\n" + currentPlayer + " starts first.");
        System.out.println("Current Symbol: " + currentSymbol);

        // UC3
        int slot = getUserSlot();

        // UC4
        int[] position = getRowColumn(slot);
        int row = position[0];
        int column = position[1];

        // UC5
        if (isValidMove(board, row, column)) {

            // UC6
            placeMove(board, row, column, currentSymbol);

            System.out.println("\nMove Placed Successfully!");

            printBoard(board);

        } else {
            System.out.println("Invalid Move!");
        }
    }
}