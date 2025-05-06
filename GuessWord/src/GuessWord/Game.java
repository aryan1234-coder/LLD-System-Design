package GuessWord;

import java.util.HashSet;
import java.util.Set;

public class Game {
    private Word word;
    private Player player;
    private int attempts;
    private Set<Character> guessedLetters;

    public Game(String wordToGuess, Player player, int attempts) {
        this.word = new Word(wordToGuess);
        this.player = player;
        this.attempts = attempts;
        this.guessedLetters = new HashSet<>();
    }
    
  

    public void start() {
        System.out.println("Welcome to Word Guess Game!");
        while (attempts > 0) {
            word.displayGuessedWord();
            System.out.println("Remaining attempts: " + attempts);
            char guess = player.makeGuess();

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter!");
                continue;
            }

            guessedLetters.add(guess);

            if (word.updateGuessedWord(guess)) {
                System.out.println("Good guess!");
            } else {
                System.out.println("Incorrect guess.");
                attempts--;
            }

            if (word.isFullyGuessed()) {
                System.out.println("Congratulations " + player.getName() + "! You guessed the word!");
                word.displayGuessedWord();
                return;
            }
        }

        System.out.println("Sorry, you've run out of attempts.");
        System.out.println("The word was: " + word.getActualWord());
    }
}
