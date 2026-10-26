class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lc=0;
        int rc=0;
        int l=moves.length();
        for(int i=0;i<l;i++){
            char ch=moves.charAt(i);
            if(ch=='L') lc++;
            else if(ch=='R') rc++;
        }
        int diff=Math.abs(lc-rc);
        return l-(lc+rc)+diff;
    }
}