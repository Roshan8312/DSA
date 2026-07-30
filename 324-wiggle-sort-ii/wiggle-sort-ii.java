class Solution {
    public void wiggleSort(int[] nums) {
        //sort  array
    Arrays.sort(nums);
        //make an extra array and manage equility in it 
    int n = nums.length;
    int i=1;
    int j =n-1;
    int[] res = new int[n];
    while(i<n){
        res[i] = nums[j];
        i = i+2;
        j--;
    }
    i = 0;
    while(i<n){
        res[i] = nums[j];
        i = i+2;
        j--;
    }
        //fill input array form result
        for(i =0;i<n;i++){
            nums[i] = res[i];
        } 
    }
}