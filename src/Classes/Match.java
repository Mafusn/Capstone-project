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

    public void playMatch(int homeTeamGoals, int awayTeamGoals) {
        this.homeTeam.setScoredGoals(homeTeamGoals);
        this.homeTeam.setConcededGoals(awayTeamGoals);

        this.awayTeam.setScoredGoals(awayTeamGoals);
        this.awayTeam.setConcededGoals(homeTeamGoals);

        if (homeTeamGoals == awayTeamGoals) {
            this.homeTeam.setDraws(1);
            this.awayTeam.setDraws(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            this.homeTeam.setWins(1);
            this.awayTeam.setLosses(1);
        } else {
            this.homeTeam.setLosses(1);
            this.awayTeam.setWins(1);
        }
    }
}
