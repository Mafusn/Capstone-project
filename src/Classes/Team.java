// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

import Classes.Exceptions.SameIDException;
import Classes.Exceptions.SameNumberException;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;
    private TeamLeader teamLeader;
    private ArrayList<Match> matches;
    private int scoredGoals;
    private int concededGoals;
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;
    private int points;

    public Team(String name, Coach coach, TeamLeader teamLeader) {
        this.name = name;
        this.coach = coach;
        this.teamLeader = teamLeader;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
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

    public ArrayList<Match> getMatches() {
        return this.matches;
    }

    public void addMatchToTeam(Match match) {
        this.matches.add(match);
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

    public void addScoredGoals(int scoredGoals) {
        this.scoredGoals += scoredGoals;
    }

    public int getConcededGoals() {
        return concededGoals;
    }

    public void addConcededGoals(int concededGoals) {
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
        Boolean check = true;
        for (int i = 0; i <= playersToAdd.size() - 2; i++) {
            for (int j = 0; i <= playersToAdd.size() - 2; i++) {
                if (playersToAdd.get(i).getNumber() == playersToAdd.get(j).getNumber() && i != j) {
                    String msg = "This number is occupied";
                    check = false;
                    throw new SameNumberException(msg + " " + playersToAdd.get(i).getName() + " " + playersToAdd.get(i).getNumber());
                }

                if (playersToAdd.get(i).getID() == playersToAdd.get(j).getID() && i != j) {
                    String msg = "This ID is occupied";
                    check = false;
                    throw new SameIDException(msg + " " + playersToAdd.get(i).getName() + " " + playersToAdd.get(i).getID());
                }
            }
        }

        if (check) {
            for (Player player: playersToAdd) {
                player.setTeam(this);
            }
            this.players.addAll(playersToAdd);
        }
    }
    @Override
    public String toString() {
        return String.format("%-12s", this.name + ":") +
                "     " + String.format("%2d", this.wins) +
                "    " + this.losses +
                "    " + this.draws +
                "    " +
                String.format("%3s", this.getScoredGoals()) + " - " + String.format("%3s", this.getConcededGoals()) +
                "    " + this.getPoints();
    }

    public String tableOverview() {
        return this.getName();
    }
}
