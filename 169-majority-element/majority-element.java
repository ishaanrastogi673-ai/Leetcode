class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            int n=nums[i];
            if(!map.containsKey(n)) map.put(n,1);
            else map.put(n,map.get(n)+1);
        }
        int maxno=-1;
        int maxfre=-1;
        for(int i:map.keySet()){
            if(map.get(i)>maxfre){
                maxfre=map.get(i);
                maxno=i;
            }
        }
        return maxno;
    }
}