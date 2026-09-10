class Solution {
    public boolean searchMatrix(int[][] A, int B) {
       int n = A.length;
        int m = A[0].length;
        int l = 0;
        int r = n * m - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            int element = A[mid/m][mid%m];
            if(element == B){
                return true;
            }
            else if(element > B){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}