class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int l1=order.length;
        int l2=friends.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<l2;i++){
            set.add(friends[i]);
        }
        int[] ans=new int[l2];
        int z=0;
        for(int i=0;i<l1;i++){
            if(set.contains(order[i])){ ans[z]=order[i];z++;}
        }
        return ans;
    }
}