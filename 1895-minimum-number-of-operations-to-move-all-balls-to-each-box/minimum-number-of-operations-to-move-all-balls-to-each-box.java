class Solution {
    public int[] minOperations(String boxes){
        int l=boxes.length();
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=sumStrt(boxes,0,i-1,i)+sumEnd(boxes,i+1,l,i);
        }
        return ans;
    }
    public int sumStrt(String s,int strt,int end,int target){
        int sum=0;
        for(int i=0;i<=end;i++){
            if(s.charAt(i)=='1'){
                sum+=(target-i);
            }
        }
        return sum;
    }
    public int sumEnd(String s,int strt,int end,int target){
        int sum=0;
        for(int i=strt;i<end;i++){
            if(s.charAt(i)=='1'){
                sum+=(i-target);
            }
        }
        return sum;
    }
}