class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int mid = nums.length/2;
            res = nums[mid];
        }


        
        return res;
    }
}