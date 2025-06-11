class Solution {
    public int[] finalPrices(int[] prices) {
        int []ans = new int[prices.length];
        int i, j,disc;
        for(i=0; i<prices.length-1; i++){
            ans[i]=prices[i];
            for(j=i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break; 
                }   
            }
        }
        ans[i]=prices[i];
        return ans;
    }
}