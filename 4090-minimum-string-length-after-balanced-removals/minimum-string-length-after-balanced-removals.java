class Solution {
    public int minLengthAfterRemovals(String s) {
        int l=s.length();
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<l;i++){
        //     char ch=s.charAt(i);
        //     if(ch=='a') st.push('a');
        //     else{
        //         if(!st.isEmpty()) st.pop();
        //     }
        // }
        // return st.size();
        int ca=0,cb=0;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='a') ca++;
            else cb++;
        }
        return Math.abs(ca-cb);
    }
}