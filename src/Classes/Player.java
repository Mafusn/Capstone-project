package Classes;

import java.util.ArrayList;

public class Player extends Person {
    private Team team;
    private int suspension;
    private int number;

    public Player(String name, int ID, int number) {
        super(name, ID);
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Team getTeam() {
        return this.team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension += suspension;
    }

    public ArrayList<Player> createMariboPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Erik", 1, 1));
        players.add(new Player("Peter", 2, 2));
        players.add(new Player("John", 3, 3));
        players.add(new Player("Magnus", 4, 4));
        players.add(new Player("Hans", 5, 5));
        players.add(new Player("Jens", 6, 6));
        players.add(new Player("Sebastian", 7, 7));
        players.add(new Player("Paul", 8, 8));

        return players;
    }
}
