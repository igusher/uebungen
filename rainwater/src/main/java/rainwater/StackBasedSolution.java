package rainwater;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class StackBasedSolution implements Solution {

    public StackBasedSolution() {}

    /**
     * Traverse elements from left to right and store them in a stack in decreasing order.
     * (Top-most element in a stack is the smallest one.)
     *
     * Then, if next element is greater than previous one -
     * remove items from the top of the stack until a topmost item is greater than next one or stack is empty.
     * After removing items decreasing order will be maintained.
     * While removing elements, count how much water can be filled in between.
     *
     * O(N) algo, O(N) memory
     *
     * @param landscape
     * @return
     */
    @Override
    public int solve(List<Integer> landscape) {
        if (landscape == null) {
            return 0;
        }
        int result = 0;
        // Stack <height, position>, store elements in order of decreasing heights
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        // leftmost element is always a maximum element
        int leftmostHeight = 0;
        for(int i = 0 ; i < landscape.size(); i++) {
            int h = landscape.get(i);
            int lastCovered = i;
            while(!stack.isEmpty() && stack.peek().getKey() <= h) {
                Map.Entry<Integer, Integer> next = stack.pop();
                result += (Math.min(leftmostHeight, h) - next.getKey()) * (lastCovered - next.getValue());
                lastCovered = next.getValue();
            }
            leftmostHeight = Math.max(leftmostHeight, h);
            stack.add(new AbstractMap.SimpleEntry<>(h, lastCovered));
        }
        return result;
    }
}
