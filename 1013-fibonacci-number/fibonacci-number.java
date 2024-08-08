class Solution {
    public int fib(int n) {
        // if(n==0)
        //     return 0;
        // if(n==1)
        //     return 1;
        // return fib(n-1)+fib(n-2);
        if(n==1)
            return 1;
        int sum=0,a=0,b=1;
        while(n-1>0){
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }
        return sum;
    }
}