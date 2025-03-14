class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length,i;
        int rot_nums[] = new int[len];
        for(i=0; i< len; i++)
            rot_nums[(i+k)%len] = nums[i];
        for(i=0;i<len; i++)
            nums[i]=rot_nums[i];
    }
}