package Classes.Constructors;

// Creates and returns a team, only the create team method should be public

import Classes.Coach;
import Classes.Exceptions.SameIDException;
import Classes.Exceptions.SameNumberException;
import Classes.Player;
import Classes.Team;
import Classes.TeamLeader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TeamConstructor {
    private Random rand = new Random();

    private String getRandomName() {
        ArrayList<String> listWithNames = new ArrayList<>();

        listWithNames.add("Erik");
        listWithNames.add("Peter");
        listWithNames.add("John");
        listWithNames.add("Magnus");
        listWithNames.add("Hans");
        listWithNames.add("Jens");
        listWithNames.add("Sebastian");
        listWithNames.add("Paul");
        listWithNames.add("Casper");
        listWithNames.add("Nick");
        listWithNames.add("Andrew");
        listWithNames.add("Samuel");
        listWithNames.add("Tristan");
        listWithNames.add("Carl");
        listWithNames.add("Fred");
        listWithNames.add("Michael");
        listWithNames.add("Lewis");

        return listWithNames.get(rand.nextInt(listWithNames.size() - 1));
    }

    private ArrayList<Player> createPlayers() {
        ArrayList<Integer> listWithNumbers = new ArrayList<>();
        ArrayList<Player> players = new ArrayList<>();

        // Ensures no player gets the same number
        for (int i = 0; i <= 99; i++) {
            listWithNumbers.add(i);
        }
        Collections.shuffle(listWithNumbers);

        for (int i = 0; i <= 11; i++) {
            players.add(new Player(getRandomName(), rand.nextInt(100000, 999999), listWithNumbers.get(i)));
        }

        return players;
    }
    private Coach createCoach() {
        return new Coach(getRandomName(), rand.nextInt(1000, 9999), rand.nextInt(2, 20));
    }
    private TeamLeader createTeamLeader() {
        return new TeamLeader(getRandomName(), rand.nextInt(1000, 9999), rand.nextInt(1, 5), rand.nextInt(1, 5));
    }

    public Team createTeam(String teamName) {
        ArrayList<Player> players = createPlayers();
        Team team = new Team(teamName, createCoach(), createTeamLeader());
        team.getTeamLeader().setTeam(team);
        team.getCoach().setTeam(team);

        try {
            team.addPlayers(players);
        } catch (SameNumberException e) {
            System.out.println(e.getErrorMessage());
        } catch (SameIDException e) {
            System.out.println(e.getErrorMessage());
        }

        return team;
    }
}
