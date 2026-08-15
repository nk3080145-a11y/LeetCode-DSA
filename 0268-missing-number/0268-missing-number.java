class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==n || arr[i]==i) i++;
            else{
                int idx = arr[i];
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i) return i;
        }
        return n;
    }
}