class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
        }
        int freq=map.get(s.charAt(0));
        for(char ch:map.keySet()){
            if(map.get(ch)!=freq) return false;
        }
        return true;
    }
}