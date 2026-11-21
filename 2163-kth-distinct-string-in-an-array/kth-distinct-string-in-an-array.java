class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int l=arr.length;
        for(int i=0;i<l;i++){
            String s=arr[i];
            if(!map.containsKey(s)) map.put(s,1);
            else map.put(s,map.get(s)+1);
        }
        String s="";
        for(int i=0;i<l;i++){
            if(map.get(arr[i])==1){
                s=arr[i];
                k--;
                if(k==0) return s;
            }
        }
        return "";
    }
}