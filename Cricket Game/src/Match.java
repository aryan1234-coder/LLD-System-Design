import Inning.InningDetails;
import Team.Team;

import java.util.Date;

import Inning.MatchType;

public class Match {

    public Team teamA;
    public Team teamB;
    public Date dateOfMatch;
    public String venue;
    public Team tossWinner;
    public InningDetails[] innings;
    public MatchType matchType;

    public Match(Team teamA,Team teamB,Date matchdate,String venue,MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.dateOfMatch = matchdate;
        this.venue = venue;

        this.innings = new InningDetails[2];
        this.matchType = matchType;

    }
    public void startMatch() throws Exception {
        tossWinner = toss(teamA, teamB);

        //start The Inning, there are 2 innings in a match
        for(int inning=1; inning<=2; inning++){

            InningDetails inningDetails;
            Team bowlingTeam;
            Team battingTeam;

            //assuming here that tossWinner batFirst
            boolean isChasing = false;
            if(inning == 1){
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start( -1);

            }else {
                bowlingTeam = tossWinner;
                battingTeam = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType );
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()) {
                    bowlingTeam.isWinner = true;
                }
            }


            innings[inning-1] = inningDetails;

            //print inning details
            System.out.println();
            System.out.println("INNING " + inning + " -- total Run: " + battingTeam.getTotalRuns());
            System.out.println("---Batting ScoreCard : " + battingTeam.teamName + "---");

            battingTeam.printBattingScoreCard();

            System.out.println();
            System.out.println("---Bowling ScoreCard : " + bowlingTeam.teamName + "---");
            bowlingTeam.printBowlingScoreCard();

        }

        System.out.println();
        if(teamA.isWinner){
            System.out.println("---WINNER---" + teamA.teamName);

        }else {
            System.out.println("---WINNER---" + teamB.teamName);

        }

    }

    private Team toss(Team teamA, Team teamB){
        //random function return value between 0 and 1
        if(Math.random() < 0.5) {
            return teamA;
        } else {
            return teamB;
        }
    }


}


