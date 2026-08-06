class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // Loop through every number in the array
        for (int num : nums) {
            result ^= num; // Apply bitwise XOR
        }
        
        return result; // The unique number remains
    }
}
