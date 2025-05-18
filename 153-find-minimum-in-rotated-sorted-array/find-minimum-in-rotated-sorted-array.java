class Solution {
    public int findMin(int[] nums) {
        int l,r,small=Integer.MAX_VALUE;
        l=0;
        r=nums.length-1;
        while(l<=r){
            int minlr= Math.min(nums[l],nums[r]);
            small=Math.min(minlr,small);
            l++;
            r--;
        }
        return small;
    }
}