package TicTac;

public class Cell extends Player {

    int row;
    int col;
    char symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;

        this.symbol = ' ';

    }
    public boolean isEmpty() {
        return symbol == ' ';
    }
}
