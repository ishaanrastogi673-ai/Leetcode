class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int l=deck.length;
        if(l==1) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            int num=deck[i];
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        int n1=map.get(deck[0]);
        for(int i:map.keySet()){
            n1=gCD(n1,map.get(i));
        }
        if(n1==1) return false;
        for(int n:map.keySet()){
            if(map.get(n)%n1!=0) return false;
        }
        return true;
    }
    public int gCD(int n1,int n2){
        int mi=Math.min(n1,n2);
        for(int i=mi;i>1;i--){
            if(n1%i==0 && n2%i==0) return i;
        }
        return 1;
    }
}