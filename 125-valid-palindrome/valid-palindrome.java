class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            int as=(int)ch;
            if(as>=65 && as<=90) sb.append((char)(as+32));
            else if(as>=97 && as<=122) sb.append(ch);
            else if(as>=48 && as<=57) sb.append(ch);
        }
        String st=sb.toString();
        return check(st);
    }
    boolean check(String s){
        int l=s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!= s.charAt(l-1-i)) return false;
        }
        return true;
    }
}