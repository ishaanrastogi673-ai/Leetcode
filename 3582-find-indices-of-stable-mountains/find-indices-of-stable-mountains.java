class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=height.length;
        for(int i=1;i<l;i++){
            if(height[i-1]>threshold) list.add(i);  
        }
        return list;
    }
}