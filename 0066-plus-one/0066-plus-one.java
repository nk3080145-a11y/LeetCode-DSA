class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){ 
                arr[i] = arr[i]+carry;
                carry = 0;
                break;
            }
            else{
                arr[i] = 0;
            }
        }
        if(carry==0) return arr;
        else{
            int[] ans = new int[arr.length+1];
            ans[0] = 1;
            return ans;
        }
    }
}