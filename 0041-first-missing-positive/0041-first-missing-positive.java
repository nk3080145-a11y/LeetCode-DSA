class Solution {
    public void swap(int[] arr , int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int idx = arr[i] - 1;
            if(arr[i]>arr.length || arr[i]<=0 || arr[i]==arr[idx]) i++;
            else swap(arr,i,idx);
        }
        int ans = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans = i+1;
                break;
            }
            else ans = arr.length+1;
        }
        return ans;
    }
}