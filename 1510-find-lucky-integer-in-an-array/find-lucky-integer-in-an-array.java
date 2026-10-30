class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=arr.length;
        for(int i=0;i<l;i++){
            int n=arr[i];
            if(!map.containsKey(n)) map.put(n,1);
            else map.put(n,map.get(n)+1);
        }
        int num=-1;
        for(int i:map.keySet()){
            if(map.get(i)==i){
                if(i>num) num=i;
            }
        }
        return num;
    }
}