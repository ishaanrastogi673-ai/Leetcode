class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vo=new HashMap<>();
        HashMap<Character,Integer> co=new HashMap<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(!vo.containsKey(ch)) vo.put(ch,1);
                else vo.put(ch,vo.get(ch)+1);
            }
            else{
                if(!co.containsKey(ch)) co.put(ch,1);
                else co.put(ch,co.get(ch)+1);
            }
        }
        int vf=0;
        int cf=0;
        for(char ch:vo.keySet()){
            if(vo.get(ch)>vf) vf=vo.get(ch);
        }
        for(char ch:co.keySet()){
            if(co.get(ch)>cf) cf=co.get(ch);
        }
        return vf+cf; 
    }
}