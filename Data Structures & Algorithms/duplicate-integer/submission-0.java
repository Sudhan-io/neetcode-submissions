class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            // for(int j=1;j<nums.length;j++){
            //     if(nums[i]==nums[j]){
            //         return true;
            //     }
            if(nums[i]==nums[i+1]){
                return true;
            }
            
        }
        return false;
    }
}