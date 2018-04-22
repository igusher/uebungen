package rainwater;

import java.util.Collections;
import java.util.List;

/**
 * Simple N^2 algorithm to solve the problem
 * Used as a baseline to verify optimized algorithm
 */
public class StrightForwardSolution implements Solution {

    @Override
    public int solve(List<Integer> landscape) {
        int result = 0;
        int max = Collections.max(landscape);
        for (int h = 0; h <= max; h++) {
            int left = 0;
            int right = landscape.size() - 1;
            while (left < landscape.size() && landscape.get(left++) < h); // find index of a first element greater than 'h'
            while (right > 0 && landscape.get(right--) < h); // find index of a last element greater than 'h'
            // fill every empty cell in between with water
            while (left <= right) {
                result += landscape.get(left) < h ? 1 : 0;
                left++;
            }
        }
        return result;
    }
}
