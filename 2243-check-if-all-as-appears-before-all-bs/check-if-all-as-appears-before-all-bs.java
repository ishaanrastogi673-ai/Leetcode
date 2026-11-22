class Solution {
    public boolean checkString(String s) {
        int l=s.length();
        int ind=-1;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='b') {ind=i;break;}
        }
        if(ind==-1) return true;
        for(int i=ind;i<l;i++){
            if(s.charAt(i)=='a') return false;
        }
        return true;
    }
}