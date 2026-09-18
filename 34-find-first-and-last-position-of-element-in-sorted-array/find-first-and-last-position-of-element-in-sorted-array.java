class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        if(nums.length==1) {
            if(nums[0]==target) return new int[]{0,0};
            else return new int[]{-1,-1};
        }
        int[] ans=new int[2];
        ans[0]=leftIndex(nums,target);
        ans[1]=rightIndex(nums,target);
        return ans;
    }
    public int leftIndex(int[] arr,int t){
        int low =0;
        int l=arr.length;
        int high=l-1;
        int ann=-1;
        while(low<=high){
            int mid=low +(high-low)/2;
            if(arr[mid]==t){
                ann=mid;
                high=mid-1;
            }
            else if(arr[mid]>t) high=mid-1;
            else low=mid+1;
        }
        return ann;
    }
    public int rightIndex(int[] arr,int t){
        int low =0;
        int l=arr.length;
        int high=l-1;
        int ann=-1;
        while(low<=high){
            int mid=low +(high-low)/2;
            if(arr[mid]==t){
                ann=mid;
                low=mid+1;
            }
            else if(arr[mid]>t) high=mid-1;
            else low=mid+1;
        }
        return ann;
    }
}