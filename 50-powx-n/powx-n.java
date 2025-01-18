class Solution {
    public double myPow(double x, int n) {
        long nn=Math.abs((long)n);
        if(n==0)
            return 1;
        if(n<0){
            x=1/x;
        } 
        double half= myPow(x,(int)(nn/2));
        if(nn%2==1)
            return x*half*half;
        return half* half;
    }
}