// recursion + memoization (table)
class Solution {
    private int memo[][];
    private void initMemo(int[][] memo, int m, int n){
        for (int i = 0; i<=m; i++){
            for (int j = 0; j<=n; j++){
                memo[i][j] = -1;
            }
        }
    }
    private int LCS(int[] x, int[] y, int m, int n) {
        // BC :
        if (m == 0 || n == 0)
            return 0;
        if (memo[m][n] != -1)
            return memo[m][n];
        if (x[m-1] == y[n-1])
            memo[m][n] = 1 + LCS(x,y,m-1,n-1);
        else
            memo[m][n] = Math.max(LCS(x,y,m,n-1), LCS(x,y,m-1,n));
        return memo[m][n];
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        this.memo = new int[m+1][n+1]; // need t[m][n]
        initMemo(memo, m, n);
        return LCS(nums1, nums2, m, n);

    }
}