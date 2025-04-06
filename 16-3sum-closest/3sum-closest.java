class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0, diff, ret=0 ,tsum=Integer.MAX_VALUE, i, j, k;
        if(nums.length==3)
            return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(i=0; i<nums.length-2; i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                diff=sum-target;
                diff=Math.abs(diff);
                if(tsum>=diff){
                    tsum=diff;
                    ret=sum;
                }
                if(sum > target)
                    k--;
                else
                    j++;
            }
        }
        return ret;
    }
}