class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int currLevel = 0;
        List<Integer> arr = new ArrayList<>();
        while(!q.isEmpty()){
            Pair first = q.remove();
            TreeNode node = first.node;
            int level = first.level;
            if(level!=currLevel){
                currLevel++;
                ans.add(arr);
                arr = new ArrayList<>();
            }
            arr.add(node.val);
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right, level+1));
        }
        ans.add(arr);
        return ans;
    }
}