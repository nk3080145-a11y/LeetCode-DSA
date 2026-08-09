class Solution {
    public void helper(String s,List<String> ans , int n,int left , int right){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        char l = '(';
        char r = ')';
        if(left==right){
            helper(s+l,ans,n,left-1,right);
        }
        else if(left==0){
            helper(s+r,ans,n,left,right-1);
        }
        else{
            helper(s+l,ans,n,left-1,right);
            helper(s+r,ans,n,left,right-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("",ans,n,n,n);
        return ans;
    }
}