//Q. Two sum problem in a unsorted array

class Solution {
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort with lambda expressions
      
      Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
        
    }
    public int[] twoSum(int[] nums, int target) {
        int r=nums.length-1,l=0;
        int [][]ind= new int[nums.length][2];
        int []ret=new int[2];
        for(int i=0;i<nums.length;i++){
            ind[i][0]=nums[i];
            ind[i][1]=i;
        }
        sortbyColumn(ind,0); 
        // for(int i = 0; i < nums.length ; i++)
        //     System.out.print(ind[i][0] + " " + ind[i][1] + "\n");
        while(l<r){
            if(ind[l][0]+ind[r][0]==target){
                ret[0]=ind[l][1]; ret[1]=ind[r][1];
                break;
            }
            else if(ind[l][0]+ind[r][0]>target){
                    r--;
            }
            else
                    l++;
        }
         return ret;
    }
}