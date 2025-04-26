class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        Stack<Integer> snums2 = new Stack<>();
        HashMap<Integer,Integer> nextGre = new HashMap<>();
        for(int num: nums2){
            while(!snums2.isEmpty() && num>snums2.peek()){
                nextGre.put(snums2.pop(),num);
            }
            snums2.push(num);
        }
        for(int i=0; i<nums1.length; i++){
            res[i]=nextGre.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}