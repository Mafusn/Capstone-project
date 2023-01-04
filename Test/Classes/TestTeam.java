// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestTeam {
    Coach egon = null;
    TeamLeader bente = null;
    Team team = null;
    ArrayList<Player> teamList = null;
    Match match = null;

    @BeforeEach
    public void before() {
        egon = new Coach("Egon", 1, 15);
        bente = new TeamLeader("Bente", 2, 3, 4);
        team = new Team("Ajax", egon, bente);

        ArrayList<Player> teamList = new ArrayList<>();
        Player preben = new Player("Preben", 3, 25);
        Player jens = new Player("Jens", 4, 24);
        teamList.add(preben);
        teamList.add(jens);
        team.addPlayers(teamList);

        match = new Match(1);
        team.addMatchToTeam(match);
    }
    @Test
    public void setTeam() {
        assertNotNull(team);
    }
    @Test
    public void getName() {
        assertEquals("Ajax", team.getName());
    }
    @Test
    public void getCoach() {
        assertEquals("Egon", team.getCoach().getName());
    }
    @Test
    public void getTeamLeader() {
        assertEquals("Bente", team.getTeamLeader().getName());
    }

    @Test
    public void addScoredGoals() {
        team.addScoredGoals(20);
        assertEquals(20, team.getScoredGoals());
    }

    @Test
    public void addConcededGoals() {
        team.addConcededGoals(20);
        assertEquals(20, team.getConcededGoals());
    }

    @Test
    public void addPlayers() {
        assertEquals("Jens", team.getPlayers().get(1).getName());
    }
    @Test
    public void getMatches() {
        assertEquals(1, team.getMatches().get(0).getID());
    }
}
