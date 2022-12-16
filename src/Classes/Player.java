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
}
