/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            if(i%2!=0) nthLevel1(root,i,arr);
            else nthLevel2(root,i,arr);
            list.add(arr);
        }
        return list;
    }
    public void nthLevel1(TreeNode root,int n,List<Integer> list){
        if(root==null) return;
        if(n==1) {list.add(root.val);return;}
        nthLevel1(root.left,n-1,list);
        nthLevel1(root.right,n-1,list);
    }
    public void nthLevel2(TreeNode root,int n,List<Integer> list){
        if(root==null) return;
        if(n==1) {list.add(root.val);return;}
        nthLevel2(root.right,n-1,list);
        nthLevel2(root.left,n-1,list);
    }
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}