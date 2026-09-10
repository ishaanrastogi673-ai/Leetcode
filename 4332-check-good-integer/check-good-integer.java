class Solution {
    public boolean checkGoodInteger(int n) {
       int ds=sum(n);
       int ss=squareSum(n);
       if((ss-ds)>=50) return true;
       return false; 
    }
    int squareSum(int num){
        int sum=0;
        int mm=num;
        while(mm!=0){
            int r=mm%10;
            sum=sum+(r*r);
            mm/=10;
        }
        return sum;
    }
    int sum(int num){
        int sum=0;
        int nn=num;
        while(nn!=0){
            int r=nn%10;
            sum+=r;
            nn/=10;
        }
        return sum;
    }
}