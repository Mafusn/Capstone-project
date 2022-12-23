package Classes;

import Classes.Constructors.MatchConstructor;

import java.util.ArrayList;
import java.util.Comparator;

public class Group {
    private char name;
    private ArrayList<Team> teams;
    private MatchConstructor matchConstructor = new MatchConstructor();

    public Group(char name, ArrayList<Team> teams) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.teams = teams;
    }

    public char getName() {
        return this.name;
    }

    public ArrayList<Team> getTeams() {
        return this.teams;
    }

    public Team getGroupWinner() {
        return teams.get(0);
    }
    public Team getGroupSecondPlace() {
        return teams.get(1);
    }

    public void sortTeamsInGroup(ArrayList<Team> teams) {
        Comparator<Team> comparator = new Comparator<>() {
            @Override
            public int compare(Team o1, Team o2) {
                if (o2.getPoints() == o1.getPoints()) {
                    return (o2.getScoredGoals() - o2.getConcededGoals()) - (o1.getScoredGoals() - o1.getConcededGoals());
                }
                return o2.getPoints() - o1.getPoints();
            }
        };
        teams.sort(comparator);
    }

    public void playGroupMatches() {
        for (int i = 0; i <= 2; i++) {
            for (int j = i + 1; j <= 3; j++) {
                matchConstructor.createAndPlayMatch(teams.get(i), teams.get(j));
            }
        }
    }

    public void printTeams() {
        System.out.println(String.format("\n" + "%-18s", "Holdnavn") + "W    L    D       +/-       P");
        for (int i = 0; i <= teams.size() - 1; i++) {
            System.out.println(teams.get(i));
        }
    }
}
