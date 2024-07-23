class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0,tra=1;
        while( tra<nums.length){
            if(nums[unique]!=nums[tra]){
                unique++;
                nums[unique]=nums[tra];
            }
            tra++;
        }
        return unique+1;
    }
}