class Solution {
    public int smallestIndex(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(i==sumdigit(nums[i])) return i;
        }
        return -1;
    }
    int sumdigit(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
}