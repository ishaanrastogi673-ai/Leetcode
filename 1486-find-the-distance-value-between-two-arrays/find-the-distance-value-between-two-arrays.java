class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int l1=arr1.length;
        int l2=arr2.length;
        int ind=-1;
        int max=0;
        for(int i=0;i<l1;i++){
            int count=0;
            for(int j=0;j<l2;j++){
                int x=Math.abs(arr1[i]-arr2[j]);
                if(x>d){
                    count++;
                }
            }
            if(count==l2) max++;
        }
        return max;
    }
}