class Solution {
    public int mostWordsFound(String[] sentences) {
       int l=sentences.length;
       int count=0;
       for(int i=0;i<l;i++){
        int n=counT(sentences[i]);
        if(n>count) count=n;
       }
       return count; 
    }
    public int counT(String s){
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==' ') c++;
        }
        return c+1;
    }
}