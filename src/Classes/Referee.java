package Classes;

import java.util.ArrayList;

public class Referee extends Person{
    private int yearsOfExperience;
    private ArrayList<Integer> matches;

    public Referee(String name, int ID, int yearsOfExperience) {
        super(name, ID);
        this.yearsOfExperience = yearsOfExperience;
    }

    public ArrayList<Integer> getMatches() {
        return matches;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setMatches(Match match) {
        this.matches.add(match.getID());
    }
}
