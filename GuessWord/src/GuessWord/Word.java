package GuessWord;

public class Word {
    private String actualWord;
    private char[] guessedWord;
    
    
    public String getActualWord() {
    	return actualWord;
    }

    public Word(String word) {
        this.actualWord = word.toLowerCase();
        this.guessedWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }
    }

    public boolean updateGuessedWord(char guess) {
        boolean found = false;
        for (int i = 0; i < actualWord.length(); i++) {
            if (actualWord.charAt(i) == guess) {
                guessedWord[i] = guess;
                found = true;
            }
        }
        return found;
    }

    public boolean isFullyGuessed() {
        return actualWord.equals(new String(guessedWord));
    }

    public void displayGuessedWord() {
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

