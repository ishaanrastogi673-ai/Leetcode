class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=arr.length;
        for(int i=0;i<l;i++){
            int x=arr[i];
            map.put(x,count(x));
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            list.add(arr[i]);
        }
        int ans[]=new int[l];
        int vc=0;
        for(int i:map.keySet()){
            vc=Math.max(vc,map.get(i));
        }
        int z=0;int strt=0;
        Arrays.sort(arr);
        while(strt<=vc){
            for(int i=0;i<l;i++){
                if(map.get(arr[i])==strt) ans[z++]=arr[i];
            }
            strt++;
        }
        return ans;
    }
    public int count(int n){
        String s=Integer.toBinaryString(n);
        int count=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
}