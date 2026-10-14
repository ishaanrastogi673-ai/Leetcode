class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int l=nums.size();
        int sum=0;
        for(int i=0;i<l;i++){
            if(count(i)==k) sum+=nums.get(i);
        }
        return sum;
    }
    public static int count(int n){
        String s=Integer.toBinaryString(n);
        int count=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='1') count++;
        }
        return count;
    }
}