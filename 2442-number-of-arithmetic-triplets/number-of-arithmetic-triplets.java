class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set=new HashSet<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            set.add(nums[i]);
        }
        int count=0;
        for(int i=0;i<l-2;i++){
            int f=nums[i];
            int s=f+diff;
            int t=s+diff;
            if(set.contains(s) && set.contains(t)) count++;
        }
        return count;
    }
}