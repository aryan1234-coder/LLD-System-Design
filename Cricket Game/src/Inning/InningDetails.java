package Inning;

import Team.Player.PlayerDetails;
import Team.Team;

import java.util.ArrayList;
import java.util.List;


public class InningDetails {

    Team battingTeam;
    Team bowlingTeam;
     MatchType matchType;
    List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = new TTwentyMatch();

        overs = new ArrayList<>();
    }

    public void start(int runsToWin) throws Exception {

        //set batting players
        try {
            battingTeam.chooseNextBatsMan();
        }catch (Exception e) {

        }

        int noOfOvers = matchType.noOfOvers();
        for (int overNumber = 1; overNumber <= noOfOvers; overNumber++) {

            //chooseBowler
            bowlingTeam.chooseNextBowlingMan(matchType.maxOversBallerBowled());

            OverDetails over = new OverDetails(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);
            try {
                boolean won = over.startOver(battingTeam, bowlingTeam, runsToWin);
                if(won == true) {
                    break;
                }
            }catch (Exception e) {
                break;
            }

            //swap striket and non striker
            PlayerDetails temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns(){
        return battingTeam.getTotalRuns();
    }


}
