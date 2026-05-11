class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        int buy = Integer.MAX_VALUE;
        
        for (int price: prices){
            if (price < buy)
                buy = price;
            profit = price - buy;
            max = Math.max(max, profit);
        }
        return max;
    }
}