package Classes.Constructors;

import Classes.Group;
import Classes.Team;

import java.util.ArrayList;

public class GroupConstructor {
    private int teamNumber = 0;

    private Team createTeam() {
        TeamConstructor teamConstructor = new TeamConstructor();
        ArrayList<String> teamNames = new ArrayList<>();

        teamNames.add("Ajax");
        teamNames.add("Ringsted");
        teamNames.add("Slagelse");
        teamNames.add("Maribo");
        teamNames.add("FIF");
        teamNames.add("GOG");
        teamNames.add("Aarhus");
        teamNames.add("Aalborg");
        teamNames.add("Odense");
        teamNames.add("Copenhagen");
        teamNames.add("Viborg");
        teamNames.add("Herning");
        teamNames.add("Ikast");
        teamNames.add("Holstebro");
        teamNames.add("Nykøbing");
        teamNames.add("Vejle");

        Team team = teamConstructor.createTeam(teamNames.get(teamNumber));
        teamNumber++;

        return team;
    }
    private ArrayList<Team> createTeamArray() {
        ArrayList<Team> teams = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            teams.add(createTeam());
        }

        return teams;
    }

    public Group createAndPlayGroup(Character name) {
        Group group = new Group(name, createTeamArray());
        group.playGroupMatches();
        group.sortTeamsInGroup(group.getTeams());

        return group;
    }
}
