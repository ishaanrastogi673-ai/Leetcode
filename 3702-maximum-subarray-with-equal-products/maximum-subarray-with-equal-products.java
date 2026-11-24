class Solution {
    public int maxLength(int[] nums) {
        int l=nums.length;
        int maxlen=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int pro=PRO(nums,i,j);
                int gcd=GCD(nums,i,j);
                int lcm=LCM(nums,i,j);
                if(pro == lcm*gcd) maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }
    public int PRO(int[] arr,int strt,int end){
        int pro=1;
        for(int i=strt;i<=end;i++) pro*=arr[i];
        return pro;
    }
    public int GCD(int[] arr,int strt,int end) {
        int ans = arr[strt];
        for (int i = strt; i <=end; i++) {
            ans = gcd(ans,arr[i]);
        }
        return ans;
    }
    public int LCM(int[] arr,int strt,int end) {
        int ans = arr[strt];
        for (int i = strt; i <= end; i++) {
            ans = lcm(ans, arr[i]);
        }
        return ans;
    }
    public int lcm(int n,int m){
        int max=Math.max(n,m);
        for(int i=max;i<=n*m;i++){
            if(i%n==0 && i%m==0) return i;
        }
        return n*m;
    }
    public int gcd(int n,int m){
        int min=Math.min(n,m);
        for(int i=min;i>=1;i--){
            if(n%i==0 && m%i==0) return i;
        }
        return 1;
    }
}