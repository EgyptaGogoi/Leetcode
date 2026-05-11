class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []preffixP = new int[nums.length];
        int []suffixP = new int[nums.length];
        int []ans = new int[nums.length];
        int i, j, l = nums.length;
        preffixP[0]= nums[0];
        for (i = 1; i< l; i++)
            preffixP[i]= nums[i] * preffixP[i-1];
        suffixP[l-1]= nums[l-1];
        for (j = l - 2; j>=0 ; j--)
            suffixP[j]= nums[j] * suffixP[j+1];
    
        ans[0] = suffixP[1];
        ans[l-1] = preffixP[l-2];

        for (i = 1; i< l-1; i++){
            ans[i] = preffixP[i-1] * suffixP[i+1];
        }
        return ans;
    }
}