class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length ==3)
            return nums[0]+ nums[1]+nums[2];
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int clsum= nums[0]+ nums[1]+nums[2];
        for(int i = 0; i< nums.length-2; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+ nums[l]+nums[r];
                if(sum == target)
                    return sum;
                int dist = Math.abs(target-sum);
                if(dist<min){   
                    min = dist;
                    clsum = sum;
                }
                if (target> sum)
                    l++;
                else
                    r--;
            }
        }
        return clsum; 
    }
}