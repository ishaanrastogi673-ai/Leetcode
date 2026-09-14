class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       int l=words.length;
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<l;i++){
        String ss=words[i];
        int sum=SUM(ss,weights);
        int m=122-(sum%26);
        sb.append((char)m);
       }
       return sb.toString();
    }
    public int SUM(String s,int[] arr){
        int c=0 ,l=s.length();
        for(int i=0;i<l;i++){
            c+=arr[((int)s.charAt(i))-97];
        }
        return c;
    }
}