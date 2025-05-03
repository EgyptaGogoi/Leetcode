class Solution {
    public int trap(int[] height) {
        int RG, LG, currR, currL, sum = 0, n = height.length, min;
        RG = height[n - 1];
        LG = height[0];
        currL = 0;
        currR = n - 1;

        while (currL < currR) {
            if (height[currL] < height[currR]) {
                ++currL;
                if (height[currL] >= LG) {
                    LG = height[currL]; // update LG
                } else {
                    min = Math.min(LG, RG); // LG already up to date
                    sum += min - height[currL];
                }
            } else {
                --currR;
                if (height[currR] >= RG) {
                    RG = height[currR]; // update RG
                } else {
                    min = Math.min(LG, RG); // RG already up to date
                    sum += min - height[currR];
                }
            }
        }

        return sum;
    }
}
