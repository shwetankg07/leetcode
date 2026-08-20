class Solution {
    public int singleNumber(int[] A) {
       int z = 0;
        int n = A.length;
        for(int i = 0; i < 31; i++){
            int cnt = 0;
            for(int y = 0; y < n; y++){
                if((A[y] & (1 << i)) != 0){
                    cnt++;
                }
            }
            if(cnt % 3 != 0){
                z |= (1 << i);
            }
        }
        return z;
    }
}