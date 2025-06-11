class Solution {
    public int[] finalPrices(int[] prices) {
        int []ans = new int[prices.length];
        int i, j, disc;
        for(i=0; i<prices.length; i++){
            j=prices.length-1;
            disc=0;
            while(j>i){
                if(prices[j]<=prices[i]){
                    disc=prices[j];
                }
                j--;
            }
            ans[i]=prices[i]-disc;  
        }
        return ans;
    }
}