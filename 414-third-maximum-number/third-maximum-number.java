class Solution {
    public int thirdMax(int[] nums) {
        // Use long placeholders to cleanly handle Integer.MIN_VALUE input cases
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for (int num : nums) {
            // Skip duplicates so we only track distinct numbers
            if (num == first || num == second || num == third) {
                continue;
            }
            
            // Shift values down when a new maximum is found
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        
        // If third was never updated, fallback to the absolute maximum
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;
    }
}
