class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number at its correct index
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n &&
                   nums[i] != nums[nums[i] - 1]) {

                int correctIndex = nums[i] - 1;

                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in correct position
        return n + 1;
    }
}