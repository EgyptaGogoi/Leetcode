class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r= nums.length-1, mid =0;

        while(l <= r){
            mid = l+(r-l)/2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] <= nums[r]){
                if(nums[mid] < target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            else if (nums[l] <= nums[mid]){
                if(nums[l] <= target && target < nums[mid])
                // if(l < t < m)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }
}


// 4 5   1 2 3
// l     m   r
// t=3