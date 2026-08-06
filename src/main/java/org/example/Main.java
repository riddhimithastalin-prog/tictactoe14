import java.util.Random;

public class TicTacToe {

    // Computer makes a random valid move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        while (true) {

            // Generate random slot (1-9)
            int slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            int[] position = getRowColumn(slot);

            int row = position[0];
            int col = position[1];

            // Check if the position is empty
            if (board[row][col] == ' ') {

                board[row][col] = 'O';

                System.out.println("Computer chose slot " + slot);

                break;
            }
        }
    }

    // Converts slot number to row and column
    public static int[] getRowColumn(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }
}