package Classes;

// Creates and returns a team, only the create team method should be public

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TeamConstructor {

    private ArrayList<Player> createPlayer() {
        Random rand = new Random();
        ArrayList<Integer> listWithNumbers = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            listWithNumbers.add(i);
        }
        Collections.shuffle(listWithNumbers);

        ArrayList<String> listWithNames = new ArrayList<>();
        ArrayList<Player> players = new ArrayList<>();

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

        for (int i = 0; i <= 11; i++) {
            players.add(new Player(listWithNames.get(rand.nextInt(listWithNames.size() - 1)), rand.nextInt(100000, 999999), listWithNumbers.get(i)));
        }

        return players;
    }
    // private Coach createCoach
    // private TeamLeader createTeamLeader
}
