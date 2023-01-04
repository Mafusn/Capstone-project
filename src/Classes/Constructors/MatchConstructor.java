// Magnus Peetz Holt - mph21@student.aau.dk

package Classes.Constructors;

import Classes.Match;
import Classes.Delegate;
import Classes.Referee;
import Classes.Team;

import java.util.Random;

public class MatchConstructor {
    private Random rand = new Random();
    private Referee preben = new Referee("Preben", 26452, 5);
    private Referee egon = new Referee("Egon", 26451, 4);
    private Delegate susanne = new Delegate("Susanne", 23561, 34);
    private Delegate beathe = new Delegate("Beathe", 23461, 19);

    public void createAndPlayMatch(Team awayTeam, Team homeTeam) {
        Match match = new Match(rand.nextInt(), homeTeam, awayTeam, preben, egon, susanne, beathe);
        match.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));
    }
}