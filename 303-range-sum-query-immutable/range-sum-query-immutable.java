class NumArray {
    private int[] nums;
    private int len;
    private int [] pSum;
    public NumArray(int[] nums) {
        this.nums = nums;
        len = this.nums.length;
        pSum = new int[len];
        prefixSum();
    }
    public void prefixSum(){
        pSum[0] = nums[0];
        for(int i = 1; i<len; i++)
            pSum[i] = nums[i] + pSum[i-1];
    }
    public int sumRange(int left, int right) {
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