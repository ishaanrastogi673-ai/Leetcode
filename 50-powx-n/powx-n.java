class Solution {
    public double myPow(double x, int n){
        double ans=1.0;
        long po=n;
        if(n<0) po=po*(-1);
        while(po>0){
            if(po%2==1){
                ans*=x;
                po-=1;
            }
            else{
                x=x*x;
                po/=2;
            }
        }
        if(n<0) return (double)1/(double)ans;
        else return ans;
    }
}