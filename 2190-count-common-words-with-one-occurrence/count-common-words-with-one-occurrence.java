class Solution {
    public int countWords(String[] words1, String[] words2) {
       HashMap<String,Integer> map1=new HashMap<>();
       HashMap<String,Integer> map2=new HashMap<>();
       int l1=words1.length;
       int l2=words2.length;
       for(int i=0;i<l1;i++){
        String n=words1[i];
        if(!map1.containsKey(n)) map1.put(n,1);
        else map1.put(n,map1.get(n)+1);
       }
       for(int i=0;i<l2;i++){
        String m=words2[i];
        if(!map2.containsKey(m)) map2.put(m,1);
        else map2.put(m,map2.get(m)+1);
       }
       int count=0;
       for(String i:map1.keySet()){
        if(map1.get(i)==1 && map2.containsKey(i) && map2.get(i)==1) count++;
       }
       return count;  
    }
}