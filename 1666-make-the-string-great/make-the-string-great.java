class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            char cu=s.charAt(i);
            char pr1=(char)((int)cu+32);
            char pr2=(char)((int)cu-32);
            if(!st.isEmpty() && (st.peek()==pr1 || st.peek()==pr2)) st.pop();
            else st.push(cu);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}