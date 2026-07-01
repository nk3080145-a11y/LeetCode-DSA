class Solution {
    public int[][] transpose(int[][] arr) {
        int[][] brr = new int[arr[0].length][arr.length];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[0].length;j++){
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }
}