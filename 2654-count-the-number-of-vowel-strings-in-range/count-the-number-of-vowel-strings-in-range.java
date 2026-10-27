class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(check(words[i])==true) count++;
        }
        return count;
    }
    public boolean check(String s){
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        return set.contains(s.charAt(0)) && set.contains(s.charAt(s.length()-1));
    }
}