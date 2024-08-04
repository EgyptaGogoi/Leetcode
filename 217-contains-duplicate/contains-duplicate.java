class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int i;
        // Arrays.sort(nums);
        // for(i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         return true;
        // }
        // return false;

        // using hashset
        HashSet<Integer> h= new HashSet<Integer>();
        for(int i=0; i<nums.length; i++)
            if(h.contains(nums[i]))
                return true;
            else
                 h.add(nums[i]);
        return false;
           
        
    }
}