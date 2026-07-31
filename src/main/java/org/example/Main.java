import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // UC1 : Create Board
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Print Board
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // ---------------- UC2 ----------------

        Random random = new Random();

        // Toss (0 or 1)
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

        System.out.println("\nToss Result");
        System.out.println(currentPlayer + " starts first.");

        System.out.println("Player 1 Symbol : " + player1Symbol);
        System.out.println("Player 2 Symbol : " + player2Symbol);
    }
}