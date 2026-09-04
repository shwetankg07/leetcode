class Solution {
    public int singleNonDuplicate(int[] A) {
       int n = A.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = l + (r-l)/2;
            if(A[mid] == A[mid ^ 1]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return A[l]; 
    }
}