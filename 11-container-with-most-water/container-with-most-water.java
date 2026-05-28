class Solution {
    public int maxArea(int[] height) {
        if (height.length == 2)
            return Math.min(height[0], height[1]);
        int l = 0, r = height.length -1;
        int water = Integer.MIN_VALUE;
        while(l <= r){
            int prod = (Math.min(height[l], height[r])) * (r-l);
            water = Math.max(water, prod);
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return water;
    }
}