class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            int n=123-(int)s.charAt(i);
            sum+=(n*(i+1));
        }
        return sum;
    }
}