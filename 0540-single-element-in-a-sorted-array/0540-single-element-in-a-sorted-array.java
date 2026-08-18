class Solution {
    public int singleNonDuplicate(int[] arr) {
        int lo = 0,hi = arr.length-2;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid%2!=0){
                if(arr[mid]!=arr[mid+1]) lo = mid + 1;
                else hi = mid - 1;
            }
            else{
                if(arr[mid]==arr[mid+1]) lo = mid + 2;
                else hi = mid - 1;
            }
        }
        return arr[lo];
    }
}