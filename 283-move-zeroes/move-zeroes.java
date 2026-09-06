class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        if(l==1) return ;
        int i=0;
        int j=1;
        while(j!=l){
            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else if(nums[i]!=0 && nums[j]==0){
                i++;
            }
            else{
                i++;j++;
            }
        }
        return;
    }
}