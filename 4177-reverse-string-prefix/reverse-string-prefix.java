class Solution {
    public String reversePrefix(String s, int k) {
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(reve(s.substring(0,k)));
        if(k<l){
            for(int i=k;i<l;i++){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public String reve(String s){
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}