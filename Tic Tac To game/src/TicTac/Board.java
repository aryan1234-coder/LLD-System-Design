package TicTac;

public class Board {

    private final int SIZE = 3;
    private Cell[][] board;

    public Board() {
        board = new Cell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Cell(i, j);
            }
        }

    }

    public boolean updateCell(int row, int col, char symbol) {
        if (board[row][col].isEmpty()) {
            board[row][col].symbol = symbol;
            return true;
        } else {
            return false;
        }

    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j].symbol);
                if (j < SIZE - 1) System.out.print(" |");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("---+---+---");
        }
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0].symbol == symbol && board[i][1].symbol == symbol && board[i][2].symbol == symbol)
                return true;
            if (board[0][i].symbol == symbol && board[1][i].symbol == symbol && board[2][i].symbol == symbol)
                return true;
        }
        return (board[0][0].symbol == symbol && board[1][1].symbol == symbol && board[2][2].symbol == symbol) ||
                (board[0][2].symbol == symbol && board[1][1].symbol == symbol && board[2][0].symbol == symbol);
    }

    public boolean isDraw() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j].isEmpty())
                    return false;
        return true;
    }

}
