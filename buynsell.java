class Solution {
    public int maxProfit(int[] prices) {
        int i,minp=Integer.MAX_VALUE, profit=0;
        // for(i=0;i<prices.length-1;i++){
        //     sp=prices[i];
        //     for(j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j] && sp<prices[j])
        //             sp=prices[j];
        //     }
        //     if(profit<sp-prices[i])
        //         profit=sp-prices[i];
        // }
        for(i=0; i<prices.length; i++){
            if(profit<prices[i]-minp)
                profit=prices[i]-minp;
            if(minp>prices[i])
                minp=prices[i];
        }
        return profit;
    }
}
// Use of brute force - O(n^2)
// Use of Dp - O(n)