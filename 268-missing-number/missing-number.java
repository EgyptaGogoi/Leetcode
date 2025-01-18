class Solution {
    public int missingNumber(int[] nums) {
        long sumTB, n= nums.length;
        sumTB= (n*(n+1))/2;
        System.out.print(sumTB);
        for(int ele : nums)
            sumTB-=ele;
        return (int)sumTB;
    }
}