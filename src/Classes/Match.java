package Classes;

public class Match {
    private int ID;
    private Team homeTeam;
    private int goalsHomeTeam;
    private Team awayTeam;
    private int goalsAwayTeam;
    private Referee referee1;
    private Referee referee2;
    private Official official;

    public Match(int ID, Team homeTeam, Team awayTeam, Referee referee1, Referee referee2, Official official) {
        this.ID = ID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee1 = referee1;
        this.referee2 = referee2;
        this.official = official;
    }

    public void playMatch(Team team1, int team1Goals, Team team2, int team2Goals, Referee ref1, Referee ref2, Official official) {
        if (team1Goals == team2Goals) {
            team1.setDraws(1);
            team2.setDraws(1);
        } else if (team1Goals > team2Goals) {
            team1.setWins(1);
            team2.setLosses(1);
        } else {
            team1.setLosses(1);
            team2.setWins(1);
        }
    }
}
