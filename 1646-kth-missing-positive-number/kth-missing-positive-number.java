class Solution {
    public int findKthPositive(int[] arr, int k){
        int l=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<l;i++) set.add(arr[i]);
        int num=-1;
        int strt=1;
        while(k!=0){
            if(!set.contains(strt)) {num=strt;k--;}
            strt++;
        }
        return num;
    }
}