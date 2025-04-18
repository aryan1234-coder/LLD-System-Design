package TicTac;

public enum PlayerSymbol {

    X('X'),
    O('O'),
    A('A'),
    B('B'),
    C('C'),
    STAR('*'),
    HASH('#'),
    DOLLAR('$'),
    AT('@');

    private final char symbol;

    PlayerSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
//
//    @Override
//    public String toString() {
//        return String.valueOf(symbol);
//    }
}
