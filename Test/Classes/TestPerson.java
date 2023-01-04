// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPerson {
    Coach coach = new Coach("Ernst", 1, 2);

    @Test
    public void testGetName() {
        assertEquals("Ernst", coach.getName());
    }
    @Test
    public void testGetID() {
        assertEquals(1, coach.getID());
    }
}
