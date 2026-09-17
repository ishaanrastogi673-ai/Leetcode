class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        int l=indices.length;
        Character[] arr=new Character[l];
        for(int i=0;i<l;i++){
            arr[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<l;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}