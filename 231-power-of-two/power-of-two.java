class Solution {
    public boolean isPowerOfTwo(int n) {
        // int prod=1;
        // while(prod!=n)
        //     prod=prod*2;
        // if(prod==n)
        //     return true;
        // return false; 
        if(n==0)
            return false;
        if(n%2==1 && n!=1)
            return false;
        if(n==1)
            return true;
        return isPowerOfTwo(n/2);
    }
}