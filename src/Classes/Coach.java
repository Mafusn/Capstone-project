package Classes;

public class Coach extends Person{
    private Team team;
    private int yearsOfExperience;
    private int suspension;

    public Coach(String name, int ID, int yearsOfExperience) {
        super(name, ID);
        this.yearsOfExperience = yearsOfExperience;
    }

    public Team getTeam() {
        return this.team;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension += suspension;
    }

    public String onlyNameToString() {
        return "Coach: " + this.getName();
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name = " + this.getName() +
                "team=" + team +
                ", yearsOfExperience=" + yearsOfExperience +
                ", suspension=" + suspension +
                '}';
    }
}
