class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            int n=nums[i];
            if(!map.containsKey(n)) map.put(n,1);
            else map.put(n,map.get(n)+1);
        }
        int sum=0;
        for(int i=0;i<l;i++){
            if(map.get(nums[i])%k==0) sum+=nums[i];
        }
        return sum;
    }
}