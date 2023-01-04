// Magnus Peetz Holt - mph21@student.aau.dk

package Classes.Constructors;

import Classes.Group;
import Classes.Match;
import Classes.Team;

import java.util.Random;

public class FinalsMatchConstructor {
    MatchConstructor matchConstructor = new MatchConstructor();
    Random rand = new Random();

    public FinalsMatchConstructor() {
    }

    public Team playFinalsMatch(Team awayTeam, Team homeTeam) {
        matchConstructor.createAndPlayMatch(awayTeam, homeTeam);

        int matchID = awayTeam.getMatches().size();
        Match match = awayTeam.getMatches().get(matchID - 1);

        while (match.getGoalsHomeTeam() == match.getGoalsAwayTeam()) {
            match.playOvertime(rand.nextInt(1, 6), rand.nextInt(1, 6));
        }

        if (match.getGoalsHomeTeam() < match.getGoalsAwayTeam()) {
            return awayTeam;
        } else {
            return homeTeam;
        }
    }

    public void printTableOverview(Group groupA, Group groupB, Group groupC, Group groupD) {
        Team semiFinalist1 = playFinalsMatch(groupA.getGroupWinner(), groupB.getGroupSecondPlace());
        Team semiFinalist2 = playFinalsMatch(groupA.getGroupSecondPlace(), groupB.getGroupWinner());
        Team semiFinalist3 = playFinalsMatch(groupC.getGroupWinner(), groupD.getGroupSecondPlace());
        Team semiFinalist4 = playFinalsMatch(groupC.getGroupSecondPlace(), groupD.getGroupWinner());

        // SemiFinals
        Team finalist1 = playFinalsMatch(semiFinalist1, semiFinalist2);
        Team finalist2 = playFinalsMatch(semiFinalist3, semiFinalist4);

        // Finals
        Team firstPlace = playFinalsMatch(finalist1, finalist2);
        Team secondPlace = null;
        if (firstPlace == finalist1) {
            secondPlace = finalist2;
        } else {
            secondPlace = finalist1;
        }

        System.out.println("\n\n" + "Finals: ");
        System.out.println(groupA.getGroupWinner().tableOverview() + " - " +  groupB.getGroupSecondPlace().tableOverview());
        System.out.println(String.format("%-20s", " ") + semiFinalist1.tableOverview() + " - " + semiFinalist2.tableOverview());
        System.out.println(groupA.getGroupSecondPlace().tableOverview() + " - " +  groupB.getGroupWinner().tableOverview());
        System.out.println(String.format("%-40s", " ") + firstPlace.tableOverview() + " (W)" + " - " + secondPlace.tableOverview());
        System.out.println(groupC.getGroupWinner().tableOverview() + " - " +  groupD.getGroupSecondPlace().tableOverview());
        System.out.println(String.format("%-20s", " ") + semiFinalist3.tableOverview() + " - " + semiFinalist4.tableOverview());
        System.out.println(groupC.getGroupSecondPlace().tableOverview() + " - " +  groupD.getGroupWinner().tableOverview());
    }
}
