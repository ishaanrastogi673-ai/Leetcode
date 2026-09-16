class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        String ss=st[st.length-1];
        return ss.length();
    }
}