class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            int n=nums[i];
            if(!map.containsKey(n)) map.put(n,1);
            else map.put(n,map.get(n)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>1) list.add(i);
        }
        return list;
    }
}