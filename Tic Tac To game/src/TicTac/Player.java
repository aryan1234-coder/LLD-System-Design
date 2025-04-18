package TicTac;

public class Player {

    String name;
    PlayerSymbol symbol;

    public Player(String name, PlayerSymbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public char getSymbol() {
        return symbol.getSymbol();
    }
}
