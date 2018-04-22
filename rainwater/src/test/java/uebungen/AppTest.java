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
    /**
     * Rigorous Test :-)
     */
    @Test
    public void defaultTest()
    {
        int[] defaultInput = new int[] {5,2,3,4,5,4,1,3,1};
        assertEquals(8, solution.solve(defaultInput));
    }
}
