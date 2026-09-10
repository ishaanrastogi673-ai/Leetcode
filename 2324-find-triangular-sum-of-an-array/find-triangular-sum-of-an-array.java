class Solution {
    public int triangularSum(int[] nums) {
       int l=nums.length;
       int m=0;
       while(m<l){
        for(int i=0;i<l-m-1;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
        m++;
       }
       return nums[0]; 
    }
}