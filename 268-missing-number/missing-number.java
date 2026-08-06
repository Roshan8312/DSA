class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int act = 0;
        int exp = n*(n+1)/2;
        for(int num : nums){
            act = act + num;
        }
        return exp-act;
    }
}