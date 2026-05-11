class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        
        for (int price: prices){
            if (price < buy)
                buy = price;
            max = Math.max(max, price - buy);
        }
        return max;
    }
}