class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int l=batteryPercentages.length;
        int i=0;int count=0;
        if(l==1 && batteryPercentages[0]==0) return 0;
        if(l==1 && batteryPercentages[0]!=0) return 1;
        while(i!=l){
            if(batteryPercentages[i]==0) i++;
            else if(batteryPercentages[i]>0){
                count++;
                for(int z=i+1;z<l;z++){
                    batteryPercentages[z] = Math.max(0, batteryPercentages[z] - 1);
                }
                i++;
            }
        }
        return count;
    }
}