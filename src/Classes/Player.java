package Classes;

public class Player extends Person{
    private int goals;
    private int[] matches;
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

    public int[] getMatches() {
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

    /*public void setMatches(int[] matches) {
        this.matches = matches;
    }*/

    public void setSuspension(int suspension) {
        this.suspension += suspension;
    }

    public double getGoalsPerMatch(){
        return this.goals / this.matches.length;
    }
}
