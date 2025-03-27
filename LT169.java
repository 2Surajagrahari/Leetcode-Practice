class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int res = 0;
        // for(int i=0;i<nums.length;i++){
        //     int mid = nums.length/2;
        //     res = nums[mid];
        // }

        // => O(n) time
        // O(n) time 

        int res = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                res = nums[i];
            }
            if(nums[i] == res){
                count++;
            }
            else{
                count--;
            }
        }
        return res;
    }

    
}