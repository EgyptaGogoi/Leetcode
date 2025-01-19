class Solution {
    public boolean check(int[] nums) {
        // if(nums.length==2 || nums.length==1)
        //     return true;
        int curr=nums[0],drop=0;
        for(int i=1; i<nums.length; i++){
            if(curr>nums[i])
                drop++;
            curr=nums[i];
        }
        System.out.print(drop);
        if(drop==1 && nums[0]<nums[nums.length-1])
            return false;
        if(drop>1)
            return false;
        return true;
        // if(drop)
    }
}