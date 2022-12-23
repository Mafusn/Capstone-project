package Classes;

public class Match {
    private int ID;
    private Team homeTeam;
    private int goalsHomeTeam;
    private Team awayTeam;
    private int goalsAwayTeam;
    private Referee referee1;
    private Referee referee2;
    private Official official1;
    private Official official2;

    public Match(int ID, Team homeTeam, Team awayTeam, Referee referee1, Referee referee2, Official official1, Official official2) {
        this.ID = ID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee1 = referee1;
        this.referee2 = referee2;
        this.official1 = official1;
        this.official2 = official2;
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
        this.official1.setMatches(this);
        this.official2.setMatches(this);
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
