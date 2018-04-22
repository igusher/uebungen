package rainwater;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private StackBasedSolution solution = new StackBasedSolution();

    @Test
    public void nullTest() {
        List<Integer> landscape = null;
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void emptyLandscape() {
        List<Integer> landscape = new ArrayList<>();
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void oneLandscape() {
        List<Integer> landscape = Arrays.asList(42);
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void twoLandscape() {
        List<Integer> landscape = Arrays.asList(50, 100);
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void flatLandscape() {
        List<Integer> landscape = Arrays.asList(42,42,42,42,42,42,42);
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void inclineLandscape() {
        List<Integer> landscape = Arrays.asList(1,2,3,4,5);
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void declineLandscape() {
        List<Integer> landscape = Arrays.asList(5,4,3,2,1);
        assertEquals(0, solution.solve(landscape));
    }

    @Test
    public void basicTest() {
        List<Integer> landscape = Arrays.asList(1, 0, 1);
        assertEquals(1, solution.solve(landscape));
    }

    @Test
    public void defaultTest() {
        List<Integer> landscape = Arrays.asList(5,2,3,4,5,4,1,3,1);
        assertEquals(8, solution.solve(landscape));
    }

    @Test
    public void maxCapacityTest() {
        List<Integer> landscape = new ArrayList<>(Collections.nCopies(32000 - 2 , 0));
        landscape.add(0, 32000);
        landscape.add(32000);
        assertEquals(32000 * (32000 - 2), solution.solve(landscape));
    }

    @Test
    public void maxCapacityMinusOnePillarTest() {
        List<Integer> landscape = new ArrayList<>(Collections.nCopies(32000 - 2 , 0));
        landscape.add(0, 32000);
        landscape.add(32000);
        landscape.set(1000, 31000);
        assertEquals(32000 * (32000 - 2) - 31000, solution.solve(landscape));
    }
}
