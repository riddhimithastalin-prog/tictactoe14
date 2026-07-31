import java.util.Random;
import java.util.Scanner;

public class Main {

    // UC3 - Accept User Slot Input
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    // UC4 - Convert Slot Number to Row and Column
    public static int[] getRowColumn(int slot) {
        int row = (slot - 1) / 3;
        int column = (slot - 1) % 3;

        return new int[]{row, column};
    }

    public static void main(String[] args) {

        // UC1 - Create and Initialize Board
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

        // UC2 - Toss to Decide First Player
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

        // UC3 - Read User Slot
        int slot = getUserSlot();

        // UC4 - Convert Slot to Row and Column
        int[] position = getRowColumn(slot);

        System.out.println("Row = " + position[0]);
        System.out.println("Column = " + position[1]);
    }
}