class Solution {
    public int[] leftRightDifference(int[] nums) {
       int l=nums.length;
       int[] ls=new int[l];
       ls[0]=0;
       int[] rs=new int[l];
       rs[l-1]=0;
       for(int i=1;i<l;i++){
        ls[i]=SUM(nums,0,i-1);
       }
       for(int i=0;i<l-1;i++){
        rs[i]=SUM(nums,i+1,l-1);
       }
       for(int i=0;i<l;i++){
        int n=ls[i]-rs[i];
        if(n<0) n*=(-1);
        nums[i]=n;
       }
       return nums; 
    }
    public int SUM(int[] arr,int strt,int end){
        int sum=0;
        for(int i=strt;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}