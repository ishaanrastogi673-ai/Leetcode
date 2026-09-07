class Solution {
    public int minMoves(int[] nums) {
        int l=nums.length;
        int max=nums[0];
        for(int i=0;i<l;i++){
            if(nums[i]>max) max=nums[i];
        }
        int count=0;
        for(int i=0;i<l;i++){
            count=count+(max-nums[i]);
        }
        return count;
    }
}