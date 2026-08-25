class Solution {
    public boolean searchMatrix(int[][] A, int B) {
       int n = A.length;
        int m = A[0].length;
        int z = n * m;
        int kick[] = new int[z];
        int k = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                kick[k++] = A[i][j];
            }
        }
        int l = 0;
        int r = z-1;
        while(r >= l){
            int mid = l + (r-l)/2;
            if(kick[mid] < B){
                l = mid + 1;
            }
            else if(kick[mid] > B){
                r = mid - 1;
            }
            else{
                return true;
            }
        }
        return false; 
    }
}