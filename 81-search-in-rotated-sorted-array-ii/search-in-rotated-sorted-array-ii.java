class Solution {
    public boolean search(int[] nums, int target) {
        for( int e : nums){
            if( e == target)
                return true;
        }
        return false;
    }
}