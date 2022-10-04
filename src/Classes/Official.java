package Classes;

public class Official extends Person{
    private int yearsOfExperience;
    private Match[] matches;

    public Official(String name, int ID, int yearsOfExperience) {
        super(name, ID);
        this.yearsOfExperience = yearsOfExperience;
    }

    public Match[] getMatches() {
        return matches;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }
}