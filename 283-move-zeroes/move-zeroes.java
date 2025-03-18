class Solution {
    public void moveZeroes(int[] nums) {
        int len= nums.length, i=0, j=0, count0=0;
        while(i<len){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            else
                count0++;
            i++;
        }
        while(count0>0){
            nums[j]=0;
            j++;
            count0--;
        }
    }
}