class Solution {
    public int[] findArray(int[] pref) {
        int l=pref.length;
        int[] ans=new int[l];
        if(l==1) return pref;
        ans[0]=pref[0];
        for(int i=1;i<l;i++){
            ans[i]=pref[i-1]^pref[i];
        }
        return ans;
    }
    // public int xOR(int[] arr,int strt,int end){
    //     int c=0;
    //     for(int i=strt;i<=end;i++){
    //         c^=arr[i];
    //     }
    //     return c;
    // }
}