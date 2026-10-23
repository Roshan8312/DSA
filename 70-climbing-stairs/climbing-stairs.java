class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 2) {
            return n;
        }
        
        int first = 1;  // Ways to reach the 1st step
        int second = 2; // Ways to reach the 2nd step
        
        // Iteratively calculate ways for steps 3 to n
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
}
