package Classes;

public class Match {
    private int ID;
    private Team homeTeam;
    private int goalsHomeTeam;
    private Team awayTeam;
    private int goalsAwayTeam;
    private Referee referee1;
    private Referee referee2;
    private Delegate delegate1;
    private Delegate delegate2;

    public Match(int ID, Team homeTeam, Team awayTeam, Referee referee1, Referee referee2, Delegate delegate1, Delegate delegate2) {
        this.ID = ID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee1 = referee1;
        this.referee2 = referee2;
        this.delegate1 = delegate1;
        this.delegate2 = delegate2;
    }

    public Match(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public int getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void playMatch(int homeTeamGoals, int awayTeamGoals) {
        this.goalsHomeTeam = homeTeamGoals;
        this.goalsAwayTeam = awayTeamGoals;

        this.homeTeam.addScoredGoals(homeTeamGoals);
        this.homeTeam.addConcededGoals(awayTeamGoals);

        this.awayTeam.addScoredGoals(awayTeamGoals);
        this.awayTeam.addConcededGoals(homeTeamGoals);

        if (homeTeamGoals == awayTeamGoals) {
            this.homeTeam.setDraws(1);
            this.homeTeam.addPoints(1);
            this.awayTeam.setDraws(1);
            this.awayTeam.addPoints(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            this.homeTeam.setWins(1);
            this.homeTeam.addPoints(2);
            this.awayTeam.setLosses(1);
        } else {
            this.homeTeam.setLosses(1);
            this.awayTeam.setWins(1);
            this.awayTeam.addPoints(2);
        }

        this.homeTeam.addMatchToTeam(this);
        this.awayTeam.addMatchToTeam(this);

        this.referee1.setMatches(this);
        this.referee2.setMatches(this);
        this.delegate1.setMatches(this);
        this.delegate2.setMatches(this);
    }

    public void playOvertime(int homeTeamGoals, int awayTeamGoals) {
        this.goalsHomeTeam = homeTeamGoals;
        this.goalsAwayTeam = awayTeamGoals;

        this.homeTeam.addScoredGoals(homeTeamGoals);
        this.homeTeam.addConcededGoals(awayTeamGoals);

        this.awayTeam.addScoredGoals(awayTeamGoals);
        this.awayTeam.addConcededGoals(homeTeamGoals);
    }
}
