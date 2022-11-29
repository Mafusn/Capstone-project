package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private char name;
    private ArrayList<Team> teams;

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

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void sortTeamsInGroup(ArrayList<Team> teams) {
        for (int i = 0; i <= teams.size() - 1; i++) {
            for (int j = 0; j <= teams.size() - 1; j++) {
                if (teams.get(j).getPoints() < teams.get(i).getPoints() && i != j) {
                    Team teamPlaceholder = teams.get(i);
                    teams.set(i, teams.get(j));
                    teams.set(j, teamPlaceholder);
                }
            }
        }

        for (int i = 0; i <= teams.size() - 1; i++) {
            for (int j = 0; j <= teams.size() - 1; j++) {
                if (teams.get(j).getPoints() <= teams.get(i).getPoints()
                    && teams.get(j).getScore() < teams.get(i).getScore()
                    && i != j) {
                        Team teamPlaceholder = teams.get(i);
                        teams.set(i, teams.get(j));
                        teams.set(j, teamPlaceholder);
                }
            }
        }
    }

    public void printTeams() {
        System.out.println(String.format("%-21s", "Holdnavn") + "W    L    D      +/-      P");
        for (int i = 0; i <= teams.size() - 1; i++) {
            System.out.println(teams.get(i));
        }
    }
}
