class Solution {
    public int[] finalPrices(int[] prices) {
        int []ans = new int[prices.length];
        int i, j, minj ,flag,disc;
        for(i=0; i<prices.length-1; i++){
            // j=prices.length-1;
            // minj=prices.length-1;
            // flag=0;
            // while(j>i){
            //     if(minj>j && prices[j]<=prices[i]){
            //         minj=j;
            //         flag=1;
            //     } 
            //     j--;
            // }
            // System.out.print(prices[minj]);
            // if(flag<1)
            //     ans[i]=prices[i];
            // else
            //     ans[i]=prices[i]-prices[minj];
            if(prices[i+1]<prices[i]){
                ans[i]=prices[i]-prices[i+1];
            }
            else{
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
        }
        ans[i]=prices[i];
        return ans;
    }
}