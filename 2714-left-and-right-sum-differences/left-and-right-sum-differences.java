class Solution {
    public int[] leftRightDifference(int[] nums) {
       int l=nums.length;
       int[] left=new int[l];
       int[] right=new int[l];
       left[0]=0;right[l-1]=0;
       int sum=0;
       for(int i=1;i<l;i++){
        sum+=nums[i-1];
        left[i]=sum;
       }
       sum=0;
       for(int i=l-2;i>=0;i--){
        sum+=nums[i+1];
        right[i]=sum;
       }
       for(int i=0;i<l;i++){
        int diff=left[i]-right[i];
        if(diff<0) diff=diff*(-1);
        nums[i]=diff;
       }
       return nums; 
    }
}