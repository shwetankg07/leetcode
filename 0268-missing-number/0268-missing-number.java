class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorall = 0;
        for(int sus : nums){
            xorall ^= sus;
        }
        for(int i = 1; i <= n; i++){
            xorall ^= i;
        }
        return xorall;
    }
}