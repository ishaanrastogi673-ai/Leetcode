class Solution {
    public int[] leftRightDifference(int[] nums) {
       int l=nums.length;
       int[] ans=new int[l];
       for(int i=0;i<l;i++){
        int diff=SUM(nums,0,i-1)-SUM(nums,i+1,l-1);
        if(diff<0) diff*=(-1);
        ans[i]=diff;
       }
       return ans; 
    }
    public int SUM(int[] arr,int strt,int end){
        int l=arr.length;
        if(end<0 || strt==l) return 0;
        int sum=0;
        for(int i=strt;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}