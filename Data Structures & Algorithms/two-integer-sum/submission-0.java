class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];
            if (map.containsKey(dif)) {
                arr[0] = map.get(dif);
                arr[1] = i;
                return arr;
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
