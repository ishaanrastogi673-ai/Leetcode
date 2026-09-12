class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int l=hours.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(hours[i]>=target) count++;
        }
        return count;
    }
}