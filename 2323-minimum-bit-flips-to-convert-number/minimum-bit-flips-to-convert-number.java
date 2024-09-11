class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal, rslt = 0;
        while(xor!=0){
            rslt += xor & 1;
            xor >>= 1;
        }
        return rslt;
    }
}