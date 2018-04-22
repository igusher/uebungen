package uebungen;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Solution solution = new Solution();


    @Test void nullTest() {
        int[] defaultInput = null;
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void emptyLandscape() {
        int[] defaultInput = new int[] {};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void oneLandscape() {
        int[] defaultInput = new int[] {42};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void twoLandscape() {
        int[] defaultInput = new int[] {50, 100};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void flatLandscape() {
        int[] defaultInput = new int[] {42,42,42,42,42,42,42};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void inclineLandscape() {
        int[] defaultInput = new int[] {1,2,3,4,5};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test void declineLandscape() {
        int[] defaultInput = new int[] {5,4,3,2,1};
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void defaultTest() {
        int[] defaultInput = new int[] {5,2,3,4,5,4,1,3,1};
        assertEquals(8, solution.solve(defaultInput));
    }
}
g