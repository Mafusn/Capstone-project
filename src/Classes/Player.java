package Classes;

import java.util.ArrayList;

public class Player extends Person{
    private int goals;
    private ArrayList<Integer> matches;
    private Team team;
    private int suspension;
    private int number;

    public Player(String name, int ID, int number, Team team, int suspension) {
        super(name, ID);
        this.team = team;
        this.suspension = suspension;
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public int getGoals() {
        return this.goals;
    }

    public ArrayList<Integer> getMatches() {
        return this.matches;
    }

    public Team getTeam() {
        return this.team;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setGoals(int goals) {
        this.goals += goals;
    }

    public void setMatches(Match match) {
        this.matches.add(match.getID());
    }

    public void setSuspension(int suspension) {
        this.suspension += suspension;
    }

    public double getGoalsPerMatch(){
        return (double) this.goals / this.matches.size();
    }
}
