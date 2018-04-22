package uebungen;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Generate random landscape of a limited length
 * and compare result of a simplistic base algorithm to an optimized one
 */
public class RandomTest {

    private static final int TEST_COUNT = 1000;
    private static final int LANDSCAPE_LENGTH = 100;
    private static final int MAX_HEIGHT = 100;

    private Solution solution = new StackBasedSolution();
    private Solution baseSolution = new StrightForwardSolution();

    @Test
    public void selfTest() {
        List<Integer> defaultInput = Arrays.asList(5,2,3,4,5,4,1,3,1);
        assertEquals(8, baseSolution.solve(defaultInput));
    }

    @Test
    public void randomTest() {
        for (int tc = 0; tc < TEST_COUNT; tc++) {
            List<Integer> landscape = this.generateLandscape(LANDSCAPE_LENGTH);
            assertEquals(baseSolution.solve(landscape), solution.solve(landscape));
        }
    }

    private List<Integer> generateLandscape(int length) {
        Random r = new Random(System.nanoTime());
        List<Integer> result = new ArrayList<>();
        while(length-- > 0) {
            result.add(r.nextInt(MAX_HEIGHT));
        }
        return result;
    }


}
