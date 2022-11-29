package Classes;

import Classes.Exceptions.SameIDException;
import Classes.Exceptions.SameNumberException;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;
    private TeamLeader teamLeader;
    private ArrayList<Integer> matches;
    private int scoredGoals;
    private int concededGoals;
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;
    private int points;

    public Team(String name, Coach coach, TeamLeader teamLeader, int wins, int losses, int draws) {
        this.name = name;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.coach = coach;
        this.teamLeader = teamLeader;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public void createTeamBarcelona() {
        this.name = "Barcelona";
        this.coach = new Coach("Antonio Carlos Ortega", 123461, 15);
        this.teamLeader = new TeamLeader("Xavier O'Callaghan", 123462, 15, 2);
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

    public void addMatchToTeam(Integer matchId) {
        this.matches.add(matchId);
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

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addPlayers(ArrayList<Player> playersToAdd) {
        for (int i = 0; i <= playersToAdd.size() - 2; i++) {
            for (int j = 0; i <= playersToAdd.size() - 2; i++) {
                if (playersToAdd.get(i).getNumber() == playersToAdd.get(j).getNumber() && i != j) {
                    String msg = "This number is occupied";
                    throw new SameNumberException(msg + " " + playersToAdd.get(i).getName() + " " + playersToAdd.get(i).getNumber());
                }

                if (playersToAdd.get(i).getID() == playersToAdd.get(j).getID() && i != j) {
                    String msg = "This ID is occupied";
                    throw new SameIDException(msg + " " + playersToAdd.get(i).getName() + " " + playersToAdd.get(i).getID());
                }
            }
        }

        this.players.addAll(playersToAdd);
    }
    @Override
    public String toString() {
        return String.format("%-12s", this.name + ":") +
                "     " + String.format("%5d", this.wins) +
                "    " + this.losses +
                "    " + this.draws +
                "    " +
                this.getScoredGoals() + " - " + this.getConcededGoals() +
                "    " + this.getPoints();
    }
}
