package Classes;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

public class TestReferee {
    Referee referee = null;
    Match match = null;
    @BeforeEach
    public void before() {
        referee = new Referee("Egon", 2, 25);
        match = new Match(1);

        referee.setMatches(match);
    }

    @Test
    public void referee() {
        assertNotNull(referee);
    }
    @Test
    public void getYearsOfExperience() {
        assertEquals(25, referee.getYearsOfExperience());
    }

    @Test
    public void getMatches() {
        assertEquals(1, referee.getMatches().get(0).getID());
    }
}
