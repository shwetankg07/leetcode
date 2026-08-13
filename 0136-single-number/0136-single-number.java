class Solution {
    public int singleNumber(int[] nums) {
       int cnt = nums.length;
       int ans = nums[0];
       for(int i = 1; i < cnt; i++){
            ans = ans ^ nums[i];
       } 
       return ans;
    }
}