// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

public class TeamLeader extends Person{
    private Team team;
    private int iceBags;
    private int sportsTape;
    private int suspension;

    public TeamLeader(String name, int ID, int iceBags, int sportsTape) {
        super(name, ID);
        this.iceBags = iceBags;
        this.sportsTape = sportsTape;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
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
                ", suspension=" + suspension +
                '}';
    }
}
