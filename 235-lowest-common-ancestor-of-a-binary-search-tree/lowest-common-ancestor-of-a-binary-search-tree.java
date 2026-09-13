class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=check(root.left,p);
        boolean rightq=check(root.right,q);
        if((leftp==true && rightq==true) ||(leftp==false && rightq==false)) return root;
        if(leftp==true && rightq==false) return lowestCommonAncestor(root.left,p,q);
        if(leftp==false && rightq==true) return lowestCommonAncestor(root.right,p,q);
        return null;
    }
    public boolean check(TreeNode root,TreeNode s){
        if(root==null) return false;
        if(root==s) return true;
        return check(root.left,s) || check(root.right,s);
    }
}