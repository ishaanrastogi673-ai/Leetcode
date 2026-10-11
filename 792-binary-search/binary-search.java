class Solution {
    public int search(int[] nums, int target) {
        int strt=0;
        int l=nums.length;
        int end=l-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(nums[mid]>target) end=mid-1;
            else if(nums[mid]<target) strt=mid+1;
            else return mid;
        }
        return -1;
    }
}