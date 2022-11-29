package Classes;

import java.util.ArrayList;

public class Official extends Person{
    private int yearsOfExperience;
    private ArrayList<Integer> matches;

    public Official(String name, int ID, int yearsOfExperience) {
        super(name, ID);
        this.yearsOfExperience = yearsOfExperience;
        this.matches = new ArrayList<>();
    }

    public ArrayList<Integer> getMatches() {
        return matches;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setMatches(Integer matchId) {
        this.matches.add(matchId);
    }
}
