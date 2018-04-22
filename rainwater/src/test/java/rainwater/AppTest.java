package rainwater;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private StackBasedSolution solution = new StackBasedSolution();

    @Test
    public void nullTest() {
        List<Integer> defaultInput = null;
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void emptyLandscape() {
        List<Integer> defaultInput = new ArrayList<>();
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void oneLandscape() {
        List<Integer> defaultInput = Arrays.asList(42);
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void twoLandscape() {
        List<Integer> defaultInput = Arrays.asList(50, 100);
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void flatLandscape() {
        List<Integer> defaultInput = Arrays.asList(42,42,42,42,42,42,42);
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void inclineLandscape() {
        List<Integer> defaultInput = Arrays.asList(1,2,3,4,5);
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void declineLandscape() {
        List<Integer> defaultInput = Arrays.asList(5,4,3,2,1);
        assertEquals(0, solution.solve(defaultInput));
    }

    @Test
    public void basicTest() {
        List<Integer> defaultInput = Arrays.asList(1, 0, 1);
        assertEquals(1, solution.solve(defaultInput));
    }

    @Test
    public void defaultTest() {
        List<Integer> defaultInput = Arrays.asList(5,2,3,4,5,4,1,3,1);
        assertEquals(8, solution.solve(defaultInput));
    }
}
