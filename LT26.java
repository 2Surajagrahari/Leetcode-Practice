class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
            i++;
        }
        return j+1;
    }
}