class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length-1;
        int i = 0;
        int dubli = -1;
        while(i<arr.length){
            if(arr[i]==i+1) i++;
            else{
                int idx = arr[i]-1;
                if(arr[i]==arr[idx]){ 
                    dubli =  arr[i];
                    break;
                }
                swap(arr,i,idx);
            }
        }
        return dubli;
    }
    public void swap(int[] arr , int i , int idx){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}