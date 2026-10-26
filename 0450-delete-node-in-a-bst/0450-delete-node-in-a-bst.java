class Solution {
    public TreeNode deleteNode(TreeNode root, int tar) {
        if(root==null) return null;
        if(root.val>tar){
            root.left = deleteNode(root.left,tar);
        }
        else if(root.val<tar){
            root.right = deleteNode(root.right,tar);
        }
        else{
            if(root.left==null && root.right==null) return null;
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            TreeNode pred = root.left;
            while(pred.right!=null) pred = pred.right;
            root.left = deleteNode(root.left,pred.val);
            pred.left = root.left;
            pred.right = root.right;
            return pred;
        }
        return root;
    }
}