import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        // Boundary before the string starts
        stack.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                // Store index of '('
                stack.push(i);

            } else {

                // Remove matching '('
                stack.pop();

                if (stack.isEmpty()) {

                    // Current ')' becomes new boundary
                    stack.push(i);

                } else {

                    // Calculate valid substring length
                    int length = i - stack.peek();

                    max = Math.max(max, length);
                }
            }
        }

        return max;
    }
}