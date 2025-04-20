package Team.Player;

import java.util.*;

public class PlayerBowlingController {
    Deque<PlayerDetails> bowlersList;
    Map<PlayerDetails, Integer> bowlerVsOverCount;
    PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlers) {
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<PlayerDetails> bowlersList) {
        this.bowlersList = new LinkedList<>();
        bowlerVsOverCount = new HashMap<>();
        for (PlayerDetails bowler : bowlersList) {
            this.bowlersList.addLast(bowler);
            bowlerVsOverCount.put(bowler, 0);
        }
        // yahan par maine map me har bowler ke samne initail 0 over kara hoga vo dala diya hai?
        // Ok
    }

    // now ab bowler ne apne format ke according poore over dala diye to ab next bowler ka number aayega

    public void getNextBowler(int maxOverCountPerBowler) {

        // Step 1: Poll the next bowler from the list
        PlayerDetails playerDetails = bowlersList.poll();

        // 🛡️ Defensive check: If the bowler already bowled max overs, skip to next
        int bowledOvers = bowlerVsOverCount.getOrDefault(playerDetails, 0);
        if (bowledOvers >= maxOverCountPerBowler) {
            // Recursively call to find the next eligible bowler
            getNextBowler(maxOverCountPerBowler);
            return;
        }

        // Step 2: Check if this over will be his last
        if (bowledOvers + 1 == maxOverCountPerBowler) {
            currentBowler = playerDetails;
            // Do NOT add back to the list, since this is his last over
        } else {
            currentBowler = playerDetails;
            bowlersList.addLast(playerDetails); // Rotate for next time
        }

        // Step 3: Update bowler’s over count
        bowlerVsOverCount.put(playerDetails, bowledOvers + 1);
    }

    public PlayerDetails getCurrentBowler(){
        return currentBowler;
    }

}
