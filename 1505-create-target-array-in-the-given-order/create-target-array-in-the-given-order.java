class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            list.add(index[i],nums[i]);
        }
        int n=list.size();
        int ans[]=new int[n];
        for(int i=0;i<l;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}