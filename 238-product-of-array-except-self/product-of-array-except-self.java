class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int pro=1;
        int ind=-1;
        int count=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=0) pro*=nums[i];
            else {ind=i;count++;}
        }
        if(count>1){
            int[] ans=new int[l];
            return ans;
        }
        if(count==1){
            for(int i=0;i<l;i++){
                if(i==ind) nums[i]=pro;
                else nums[i]=0;
            }
            return nums;
        }
        for(int i=0;i<l;i++){
                nums[i]=pro/nums[i];
            }

        return nums;
    }
}