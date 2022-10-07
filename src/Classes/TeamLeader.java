package Classes;

public class TeamLeader extends Person{
    private Team team;
    private int iceBags;
    private int sportsTape;
    private int phoneNumber;
    private int suspension;

    public TeamLeader(String name, int ID, int iceBags, int sportsTape, int phoneNumber) {
        super(name, ID);
        this.iceBags = iceBags;
        this.sportsTape = sportsTape;
        this.phoneNumber = phoneNumber;
    }

    public Team getTeam() {
        return this.team;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getIceBags() {
        return this.iceBags;
    }

    public void setIceBags(int iceBags) {
        this.iceBags += iceBags;
    }

    public int getSportsTape() {
        return this.sportsTape;
    }

    public void setSportsTape(int sportsTape) {
        this.sportsTape += sportsTape;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension += suspension;
    }

    public String onlyNameToString() {
        return "Team leader: " + this.getName();
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "name = " + this.getName() +
                "team=" + team +
                ", iceBags=" + iceBags +
                ", sportsTape=" + sportsTape +
                ", phoneNumber=" + phoneNumber +
                ", suspension=" + suspension +
                '}';
    }
}
