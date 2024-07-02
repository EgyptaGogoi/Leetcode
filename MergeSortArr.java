class MergeSortArr{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1,p2,c=0;
        // if(m==0 && n==1){
        //     nums1[0]=nums2[0];
        // }
        // else{
        int temp[]=new int[m];
        p1=0;
        while(p1<m){
            temp[p1]=nums1[p1];
            p1++;
        }
        p1=0;p2=0;
        while(p1<m && p2<n){
            if(nums2[p2]<temp[p1])
                nums1[c++]=nums2[p2++];
            else
                nums1[c++]=temp[p1++];
        }
        if(p1<m){
            while(p1<m)
                nums1[c++]=temp[p1++];
        }
        else{
            while(p2<n)
                nums1[c++]=nums2[p2++];
        }
        
    }
    public static void main(String []arg){
        //write the main function and invoke the merge function
    } 
}