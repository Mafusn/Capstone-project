package Classes;

import java.util.Arrays;

public class Group {
    private char name;
    private Team[] teams;

    public Group(char name, Team[] teams) {
        this.name = name;
        this.teams = new Team[4];
        this.teams = teams;
    }

    public char getName() {
        return this.name;
    }

    public Team[] getTeams() {
        return this.teams;
    }

    public void sortTeamsInGroup(Team[] teams) {
        for (int i = 0; i <= teams.length - 1; i++){
            System.out.println(teams[i]);
        }

        for (int i = 0; i <= teams.length - 2; i++) {
            if (teams[i].getWins() < teams[i + 1].getWins()) {
                Team teamPlaceholder = teams[i];
                teams[i] = teams[i + 1];
                teams[i + 1] = teamPlaceholder;
            }
        }

        System.out.println("\n");

        for (int i = 0; i <= teams.length - 1; i++){
            System.out.println(teams[i]);
        }
    }
}
