class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==target) list.add(i);
        }
        return list;
    }
}