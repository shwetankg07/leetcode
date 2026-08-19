class Solution {
    public int hammingWeight(int A) {
        int cnt = 0;
        for(int i = 0; i < 31; i++){
            if((A & (1 << i)) > 0){
                cnt++;
            }
        }
        return cnt; 
    }
}