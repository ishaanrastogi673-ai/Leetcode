class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int ca=0;
        int cb=0;
        int strt=10;
        if(n<19) return true;
        int i=0;
        while(n>=strt){
            if(i%2==0) {n-=strt;ca++;}
            else {n-=strt;cb++;}
            i++;strt--;
        }
        if(ca>cb) return true;
        return false;
    }
}