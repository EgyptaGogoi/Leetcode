class NumArray {
    private int[] nums;
    private int len;
    public NumArray(int[] nums) {
        this.nums = nums;
        len = this.nums.length;
    }
    
    public int sumRange(int left, int right) {
        int [] pSum = new int[len];
        pSum[0] = nums[0];
        for(int i = 1; i<len; i++)
            pSum[i] = nums[i] + pSum[i-1];
        if (left == 0) 
            return pSum[right];
        return pSum[right] - pSum[left - 1];


    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */