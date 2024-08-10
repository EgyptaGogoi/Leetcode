class Solution {

    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = (nums.length -1), mid=0;
        // if(nums[mid]>target)
        //     return 0;
        while(beg<=end) {
            mid = beg + (int)((end-beg)/2);
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                beg = mid+1;
            else
                end = mid -1;
        }
        if(nums[mid] > target)
            return mid;
        return mid + 1;

    }
}