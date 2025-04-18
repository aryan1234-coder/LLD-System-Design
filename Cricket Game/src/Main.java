import Team.Player.Person;
import Team.Player.PlayerDetails;
import Team.Player.PlayerTypes;
import Team.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Inning.MatchType;
import Inning.TTwentyMatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Main ob = new Main();

        Team teamA = ob.addTeam("India");
        Team teamB = ob.addTeam("SriLanka");

        MatchType matchType = new TTwentyMatch();



        Match match = new Match(teamA, teamB, null, "SMS STADIUM", matchType);
        match.startMatch();

    }


    private Team addTeam(String name) {

        Queue<PlayerDetails> playerDetails = new LinkedList<>();

        PlayerDetails p1 = addPlayer(name+"1", PlayerTypes.ALLROUNDER);
        PlayerDetails p2 = addPlayer(name+"2", PlayerTypes.ALLROUNDER);
        PlayerDetails p3 = addPlayer(name+"3", PlayerTypes.ALLROUNDER);
        PlayerDetails p4 = addPlayer(name+"4", PlayerTypes.ALLROUNDER);
        PlayerDetails p5 = addPlayer(name+"5", PlayerTypes.ALLROUNDER);
        PlayerDetails p6 = addPlayer(name+"6", PlayerTypes.ALLROUNDER);
        PlayerDetails p7 = addPlayer(name+"7", PlayerTypes.ALLROUNDER);
        PlayerDetails p8 = addPlayer(name+"8", PlayerTypes.ALLROUNDER);
        PlayerDetails p9 = addPlayer(name+"9", PlayerTypes.ALLROUNDER);
        PlayerDetails p10 = addPlayer(name+"10", PlayerTypes.ALLROUNDER);
        PlayerDetails p11 = addPlayer(name+"11", PlayerTypes.ALLROUNDER);

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        List<PlayerDetails> bowlers = new ArrayList<>();
        bowlers.add(p8);
        bowlers.add(p9);
        bowlers.add(p10);
        bowlers.add(p11);

        Team team = new Team(name, playerDetails, new ArrayList<>(), bowlers);
        return team;

    }

    private PlayerDetails addPlayer(String name, PlayerTypes playerType) {

        Person person = new Person();
        person.name = name;
        PlayerDetails playerDetails = new PlayerDetails(person, playerType);
        return playerDetails;
    }

}