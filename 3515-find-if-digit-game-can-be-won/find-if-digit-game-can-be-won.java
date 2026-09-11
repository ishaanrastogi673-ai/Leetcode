class Solution {
    public boolean canAliceWin(int[] nums) {
        int l=nums.length;
        int sisum=0;
        int dosum=0;
        for(int i=0;i<l;i++){
            if(nums[i]<10) sisum+=nums[i];
            else dosum+=nums[i];
        }
        if(sisum==dosum) return false;
        return true;
    }
}