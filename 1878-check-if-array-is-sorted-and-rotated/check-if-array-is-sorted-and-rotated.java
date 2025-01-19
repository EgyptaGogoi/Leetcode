class Solution {
    public boolean check(int[] nums) {
        int curr=nums[0],drop=0;
        for(int i=1; i<nums.length; i++){
            if(curr>nums[i])
                drop++;
            curr=nums[i];
        }
        if(drop==1 && nums[0]<nums[nums.length-1])
            return false;
        if(drop>1)
            return false;
        return true;
    }
}