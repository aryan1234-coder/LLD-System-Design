package TicTac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Scanner;
public class TicTacToe {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    public TicTacToe() {
        board = new Board();
        players = new Player[2];
        Scanner scanner = new Scanner(System.in);


        List<PlayerSymbol> availableSymbols = new ArrayList<>(Arrays.asList(PlayerSymbol.values()));
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name for Player " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Available Symbols:");
            for (int j = 0; j < availableSymbols.size(); j++) {
                System.out.println((j + 1) + ". " + availableSymbols.get(j));
            }

            System.out.print("Choose a symbol (enter number): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            PlayerSymbol selectedSymbol = availableSymbols.remove(choice - 1);
            players[i] = new Player(name, selectedSymbol);
        }
        currentPlayerIndex = 0;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            board.printBoard();
            Player current = players[currentPlayerIndex];
            System.out.println(current.name + " (" + current.symbol + "), enter row and column (0-2):");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || !board.updateCell(row, col, current.getSymbol())) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (board.checkWin(current.getSymbol())) {
                board.printBoard();
                System.out.println("Hurrah!!!!!!!" + " " +current.name + " wins!");
                gameEnded = true;
            } else if (board.isDraw()) {
                board.printBoard();
                System.out.println("OOPS It's a draw!");
                gameEnded = true;
            } else {
                currentPlayerIndex = 1 - currentPlayerIndex;
            }
        }

        scanner.close();
    }
}
