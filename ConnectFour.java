import java.util.Scanner;

public class ConnectFour {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = ' ';
    private static final char PLAYER1 = 'X';
    private static final char PLAYER2 = 'O';

    private char[][] board;
    private boolean player1Turn;

    public ConnectFour() {
        board = new char[ROWS][COLS];
        player1Turn = true;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            displayBoard();

            int col = getColumn(scanner);
            if (isValidMove(col)) {
                int row = dropToken(col);
                if (checkWin(row, col)) {
                    displayBoard();
                    System.out.println("Player " + (player1Turn ? "1" : "2") + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    displayBoard();
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    player1Turn = !player1Turn;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private void displayBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------------");
        for (int col = 0; col < COLS; col++) {
            System.out.print("  " + (col + 1) + " ");
        }
        System.out.println();
    }

    private int getColumn(Scanner scanner) {
        int col = -1;
        while (col < 0 || col >= COLS) {
            System.out.print("Player " + (player1Turn ? "1" : "2") + ", enter column (1-" + COLS + "): ");
            col = scanner.nextInt() - 1;
        }
        return col;
    }

    private boolean isValidMove(int col) {
        return col >= 0 && col < COLS && board[0][col] == EMPTY;
    }

    private int dropToken(int col) {
        int row = ROWS - 1;
        while (row >= 0 && board[row][col] != EMPTY) {
            row--;
        }
        if (row >= 0) {
            board[row][col] = player1Turn ? PLAYER1 : PLAYER2;
        }
        return row;
    }

    private boolean checkWin(int row, int col) {
        char token = board[row][col];
        // Check horizontal
        for (int c = 0; c <= COLS - 4; c++) {
            if (board[row][c] == token && board[row][c + 1] == token &&
                board[row][c + 2] == token && board[row][c + 3] == token) {
                return true;
            }
        }
        // Check vertical
        for (int r = 0; r <= ROWS - 4; r++) {
            if (board[r][col] == token && board[r + 1][col] == token &&
                board[r + 2][col] == token && board[r + 3][col] == token) {
                return true;
            }
        }
        // Check diagonals
        for (int r = 0; r <= ROWS - 4; r++) {
            for (int c = 0; c <= COLS - 4; c++) {
                if (board[r][c] == token && board[r + 1][c + 1] == token &&
                    board[r + 2][c + 2] == token && board[r + 3][c + 3] == token) {
                    return true;
                }
                if (board[r][c + 3] == token && board[r + 1][c + 2] == token &&
                    board[r + 2][c + 1] == token && board[r + 3][c] == token) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.playGame();
    }
}
