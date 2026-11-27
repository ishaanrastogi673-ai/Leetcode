class Solution {
    public int findMin(int[] nums) {
        int l=nums.length;
        int min=nums[0];
        for(int i=1;i<l;i++){
            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
}