class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int l=words.length;
        int count=0;
        for(int i=0;i<l;i++){
            String s=words[i];
            if(check(s,allowed)==true) count++;
        }
        return count;
    }
    public boolean check(String s,String t){
        HashSet<Integer> set=new HashSet<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(t.indexOf(s.charAt(i)) == -1) return false;
        }
        return true;
    }
}