// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

import java.util.ArrayList;

public class Delegate extends Person{
    private int yearsOfExperience;
    private ArrayList<Match> matches;

    public Delegate(String name, int ID, int yearsOfExperience) {
        super(name, ID);
        this.yearsOfExperience = yearsOfExperience;
        this.matches = new ArrayList<>();
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setMatches(Match match) {
        this.matches.add(match);
    }
}
