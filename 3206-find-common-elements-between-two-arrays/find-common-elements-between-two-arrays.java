class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int l1=nums1.length;
        int l2=nums2.length;
        for(int i=0;i<l1;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<l2;i++){
            set2.add(nums2[i]);
        }
        int count1=0;
        for(int i=0;i<l1;i++){
            if(set2.contains(nums1[i])) count1++;
        }
        int count2=0;
        for(int i=0;i<l2;i++){
            if(set1.contains(nums2[i])) count2++;
        }
        return new int[]{count1,count2};
    }
}