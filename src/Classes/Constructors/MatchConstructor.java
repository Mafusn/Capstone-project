package Classes.Constructors;

import Classes.Match;
import Classes.Official;
import Classes.Referee;
import Classes.Team;

import java.util.Random;

public class MatchConstructor {
    private Random rand = new Random();
    private Referee preben = new Referee("Preben", 26452, 5);
    private Referee egon = new Referee("Egon", 26451, 4);
    private Official susanne = new Official("Susanne", 23561, 34);
    private Official beathe = new Official("Beathe", 23461, 19);

    public void createAndPlayMatch(Team awayTeam, Team homeTeam) {
        Match match = new Match(rand.nextInt(), homeTeam, awayTeam, preben, egon, susanne, beathe);
        match.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));
    }
}