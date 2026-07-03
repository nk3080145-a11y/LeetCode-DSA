class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        int n = arr.length;  // Total no of row
        int m = arr[0].length;  //Total no of col
        int lo = 0 , hi = (n*m)-1;
        if(arr.length==0 || m==0) return false;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            int row = mid / m;
            int col = mid % m;
            if(arr[row][col]==x) return true;
            else if(arr[row][col]<x) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}