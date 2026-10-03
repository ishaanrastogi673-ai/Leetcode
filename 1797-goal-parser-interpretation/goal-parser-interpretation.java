class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int l=command.length();
        for(int i=0;i<l;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')') sb.append('o');
            else if(command.charAt(i)=='(' || command.charAt(i)==')') continue;
            else sb.append(command.charAt(i));
        }
        return sb.toString();
    }
}