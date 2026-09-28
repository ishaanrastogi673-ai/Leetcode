class Solution {
    public int maxDepth(String s) {
        int count=0;
        int l=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='(') st.push('(');
            else if(s.charAt(i)==')'){
                count=Math.max(count,st.size());
                st.pop();
            }
        }
        return count;
    }
}