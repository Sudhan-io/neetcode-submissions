class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc=0;
        int c=0;
        for(int num:nums){
            if(num==1) c+=1;
            if(num==0) c=0;
            mc=Math.max(mc,c);
        }
        return mc;
    }
}