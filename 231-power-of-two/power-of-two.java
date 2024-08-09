class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0)
        //     return false;
        // if(n%2==1 && n>1)
        //     return false;
        // if(n==1)
        //     return true;
        // return isPowerOfTwo(n/2);
        if(n==0)
            return false;
        int lg=(int) (Math.log(n) / Math.log(2));
        System.out.print(lg);
        if(Math.pow(2,lg)==n)
            return true;
        return false;
    }
}