class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        int l1=nums1.length;
        int l2=nums2.length;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<l1;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<l2;i++){
            set2.add(nums2[i]);
        }
        for(int i:set1){
            if(!set2.contains(i)) list.get(0).add(i);
        }
        for(int i:set2){
            if(!set1.contains(i)) list.get(1).add(i);
        }
        return list;
    }
}