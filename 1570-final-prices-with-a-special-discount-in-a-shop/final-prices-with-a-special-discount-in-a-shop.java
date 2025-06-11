class Solution {
    public int[] finalPrices(int[] prices) {
        int []ans = new int[prices.length];
        int i, j,disc;
        for(i=0; i<prices.length; i++){
            // if(prices[i+1]<prices[i]){
            //     ans[i]=prices[i]-prices[i+1];
            // }
            // else{
                j=prices.length-1;
                disc=0;
                while(j>i){
                    if(prices[j]<=prices[i]){
                        disc=prices[j];
                    }
                    j--;
                }
                ans[i]=prices[i]-disc;  
            // }
        }
        // ans[i]=prices[i];
        return ans;
    }
}