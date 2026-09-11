class Solution {
    public int minOperations(int[] nums, int k) {
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}