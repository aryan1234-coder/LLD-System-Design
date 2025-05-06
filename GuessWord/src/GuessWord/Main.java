package GuessWord;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Aryan");
        Game game = new Game("Hello", player, 6);
        game.start();
    }
}
