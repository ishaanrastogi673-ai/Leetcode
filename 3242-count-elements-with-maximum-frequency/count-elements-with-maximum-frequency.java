class Solution {
    public int maxFrequencyElements(int[] nums) {
        int l=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            int x=nums[i];
            if(!map.containsKey(x)) map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        int freq=1;
        for(int i:map.keySet()){
            int x=map.get(i);
            if(freq<x) freq=x;
        }
        int count=0;
        for(int i:map.keySet()){
            if(map.get(i)==freq) count+=map.get(i);
        }
        return count;
    }
}