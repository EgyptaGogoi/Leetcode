
// Q. intersect two arrays- find the common elements between two arrays
// Worst sol i have written gotta study and update it

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> A = new ArrayList<Integer>(1);
        int p1=0,n;
        // if(nums1.length>nums2.length)
        //     n=nums2.length;
        // else
        //     n=nums1.length;
        while(p1<nums1.length){
            // while(p2<nums2.length){
            //     if(nums1[p1]==nums2[p2])
            //         A.add(nums1[p1]);
            //         p1++;
            //         p2=0; 
            //     p2++;
            // }
            Arrays.sort(nums2);
            n=Arrays.binarySearch(nums2,0,nums2.length,nums1[p1]);
            if(n>=0 ){
                    A.add(nums1[p1]);
                    nums2[n]=Integer.MAX_VALUE;
            }
            p1++; 
        }

        int [] Ar= new int[A.size()]; 
          
        for (int i = 0; i < A.size(); i++)  
        { 
            Ar[i] = A.get(i); 
        } 
        return Ar;
    }
}