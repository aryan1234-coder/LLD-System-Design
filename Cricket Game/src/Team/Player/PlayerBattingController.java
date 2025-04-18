package Team.Player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    Queue<PlayerDetails> playerYettoPlay;
    PlayerDetails striker;
    PlayerDetails nonStriker;

    public PlayerBattingController(Queue<PlayerDetails> playin11) {
       this.playerYettoPlay = new LinkedList<PlayerDetails>();
       this.playerYettoPlay.addAll(playin11);
    }
    public PlayerDetails getNextPlayer() throws Exception {
        if(playerYettoPlay.isEmpty()) {
            throw new Exception();
        }
        if(striker == null) {
            striker = playerYettoPlay.poll();
        }
        if(nonStriker == null) {
            nonStriker = playerYettoPlay.poll();

        }
        return null;
    }
    public PlayerDetails getStriker() {
        return striker;
    }
    public PlayerDetails getNonStriker() {

        return nonStriker;
    }

    public void setStriker(PlayerDetails  playerDetails){
        striker = playerDetails;
    }

    public void setNonStriker(PlayerDetails  playerDetails){
        nonStriker = playerDetails;
    }



}
