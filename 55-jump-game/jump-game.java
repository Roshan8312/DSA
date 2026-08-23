class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        int lastIndex = nums.length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            if (i > maxReachable) {
                return false;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
            if (maxReachable >= lastIndex) {
                return true;
            }
        }
        return true;
    }
}
