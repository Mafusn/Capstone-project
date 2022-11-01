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

    // Fungerer slet ik...
    public void sortTeamsInGroup(ArrayList<Team> teams) {
        /*for (int i = 0; i <= teams.size() - 1; i++){
            System.out.println(teams.get(i));
        }*/

        // Sorts from most wins
        for (int i = 0; i <= teams.size() - 2; i++) {
            if (teams.get(i).getWins() < teams.get(i + 1).getWins()) {
                Team teamPlaceholder = teams.get(i);
                teams.set(i, teams.get(i + 1));
                teams.set(i + 1, teamPlaceholder);
            }
        }

        for (int i = 0; i <= teams.size() - 2; i++) {
            if (teams.get(i).getWins() <= teams.get(i + 1).getWins() &&
                    teams.get(i).getScore() <= teams.get(i + 1).getScore()) {
                Team teamPlaceholder = teams.get(i);
                teams.set(i, teams.get(i + 1));
                teams.set(i + 1, teamPlaceholder);
            }
        }

        System.out.println("\n");

        for (int i = 0; i <= teams.size() - 1; i++){
            System.out.println(teams.get(i));
        }
    }
}
