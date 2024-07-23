class Solution {
    public int removeDuplicates(int[] nums) {
        int uq=0,tr=1;
        while( tr<nums.length){
            if(nums[uq]!=nums[tr]){
                uq++;
                nums[uq]=nums[tr];
            }
            tr++;
        }
        // for( int j=0; j<nums.length; j++)
        //     System.out.print(nums[j]+ " ");
        return uq+1;
    }
}