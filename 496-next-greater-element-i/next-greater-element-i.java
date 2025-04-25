class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int i,j,curr=0,flag=0;
        for(i=0; i<nums1.length; i++){
            ans[i]=-1;
            j=0;
            flag=0;
            // curr=-1;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    // curr=nums2[j];
                    flag=1;
                } 
                if(flag==1 && nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    break;
                }
                j++;     
            }
        }
        // System.out.print(flag);
        return ans;
    }
}