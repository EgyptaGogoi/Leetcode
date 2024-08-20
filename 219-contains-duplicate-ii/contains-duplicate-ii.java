class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer, Integer> in = new HashMap <> ();
        int i;
        for(i= 0; i< nums.length; i++){
            //insert index in the map for all the unique elements in nums
            if(!in.containsKey(nums[i]))
                in.put(nums[i],i);
            else {
                // remove the previous value of the existing key and
                int b= in.get(nums[i]);
                if(Math.abs(i-b) <= k)
                    return true;
                in.put(nums[i],i);
            }
        }
        return false;
    }
}