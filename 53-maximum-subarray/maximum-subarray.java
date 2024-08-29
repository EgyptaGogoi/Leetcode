class Solution {
    public int maxSubArray(int[] nums) {
        int i, curr_sum = 0, max = Integer.MIN_VALUE;
        for (i = 0; i < nums.length; i++) {
            curr_sum += nums[i];
            if (max < curr_sum)
                max = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;
        }
        return max;
    }
}