class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        //n/2 method but runtime is 0m/s
        // if(n%2==1 && n>1)
        //     return false;
        // if(n==1)
        //     return true;
        // return isPowerOfTwo(n/2);
        
        //Log method but runtime is 4m/s
        // int lg=(int) (Math.log(n) / Math.log(2));
        // System.out.print(lg);
        // if(Math.pow(2,lg)==n)
        //     return true;
        // return false;
        if(n<0)
            return false;
        return (n&(n-1))==0;
    }
}