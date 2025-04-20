package Team;

import Team.Player.PlayerBattingController;
import Team.Player.PlayerBowlingController;
import Team.Player.PlayerDetails;

import java.util.List;
import java.util.Queue;

public class Team {

    public String teamName;
    public Queue<PlayerDetails> playersPlayin11;
    public List<PlayerDetails> benchPlayer;
    public PlayerBattingController playerBattingController;
    public PlayerBowlingController playerBowlingController;
    public boolean isWinner;

    public Team(String teamName, Queue<PlayerDetails> playersPlayin11, List<PlayerDetails> benchPlayer,List<PlayerDetails> bowlers) {
        this.teamName = teamName;
        this.playersPlayin11 = playersPlayin11;
        this.benchPlayer = benchPlayer;

        playerBattingController = new PlayerBattingController(playersPlayin11);
        playerBowlingController = new PlayerBattingController(bowlers);



    }
    public String getTeamName() {
        return teamName;

    }
    public void chooseNextBatsMan() throws Exception{
        playerBattingController.getNextPlayer();
    }
    public void chooseNextBowlingMan(int maxOverperBowler) throws Exception{
        playerBowlingController.getNextPlayer();
    }
    public PlayerDetails getStriker(){
        return playerBattingController.getStriker();
    }
    public PlayerDetails getNonStriker(){
        return  playerBattingController.getNonStriker();
    }
    public void setStriker(PlayerDetails player){
        playerBattingController.setStriker(player);
    }
    public void setNonStriker(PlayerDetails player){
        playerBattingController.setNonStriker(player);
    }
    public PlayerDetails getCurrentBowler() throws Exception {
        return playerBowlingController.getNextPlayer();
    }

    public void printBattingScoreCard(){

        for(PlayerDetails p : playersPlayin11){
            p.printBattingScoreCard();
        }

    }
    public void printBowlingScoreCard(){
        for(PlayerDetails p : playersPlayin11){
            if(p.bowlingScoreCard.totalOversCount>0){
                p.printBowlingScoreCard();
            }

        }
    }
    public int getTotalRuns(){
        int totalRun = 0;
        for(PlayerDetails p : playersPlayin11){
            totalRun +=p.battingScoreCard.totalRuns;
        }
        return totalRun;
    }


}
