package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;
    private TeamLeader teamLeader;
    private ArrayList<Integer> matches;
    private int scoredGoals;
    private int concededGoals;
    private int wins;
    private int losses;
    private int draws;

    public Team(String name, Coach coach, TeamLeader teamLeader, int wins, int losses, int draws) {
        this.name = name;
        this.players = new ArrayList<>();
        this.coach = coach;
        this.teamLeader = teamLeader;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }

    public TeamLeader getTeamLeader() {
        return teamLeader;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public ArrayList<Integer> getMatches() {
        return this.matches;
    }

    public void setMatches(Match match) {
        this.matches.add(match.getID());
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public void setLosses(int losses) {
        this.losses += losses;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws += draws;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals += scoredGoals;
    }

    public int getConcededGoals() {
        return concededGoals;
    }

    public void setConcededGoals(int concededGoals) {
        this.concededGoals += concededGoals;
    }

    public int getScore() {
        return this.getScoredGoals() - this.getConcededGoals();
    }

    public void addPlayer(Player player) {
        // Lav et for loop her for at tjekke at nummeret ikke allerede er i listen
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", " + coach.onlyNameToString() +
                ", " + teamLeader.onlyNameToString() +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals: " + this.getScore() +
                '}';
    }
}
