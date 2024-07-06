//Q. if two sum is done in a sorted array

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        int []sol = new int[2];
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                sol[0]=l+1;
                sol[1]=r+1;
                break;
            }
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return sol;
    }
}