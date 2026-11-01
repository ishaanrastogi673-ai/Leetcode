class Solution {
    public String reversePrefix(String word, char ch) {
        int l=word.length();
        int ind=-1;
        for(int i=0;i<l;i++){
            char cc=word.charAt(i);
            if(cc==ch) {ind=i;break;}
        }
        StringBuilder sb=new StringBuilder();
        sb.append(reverse(word,ind));
        for(int i=ind+1;i<l;i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
    public String reverse(String s,int end){
        StringBuilder ss=new StringBuilder();
        for(int i=end;i>=0;i--){
            ss.append(s.charAt(i));
        }
        return ss.toString();
    }
}