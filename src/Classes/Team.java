package Classes;

public class Team {
    private String name;
    private Player[] players;
    private Coach coach;
    private TeamLeader teamLeader;
    private Match[] matches;
    private int wins;
    private int losses;
    private int draws;

    public Team(String name, Coach coach, TeamLeader teamLeader, int wins, int losses, int draws) {
        this.name = name;
        this.players = new Player[12];
        this.coach = coach;
        this.teamLeader = teamLeader;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public Match[] getMatches() {
        return this.matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
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

    public void addPlayer(Player player) {
        // Lav et for loop her for at tjekke at nummeret ikke allerede er i listen
        this.players[player.getNumber()] = player;
    }
}
