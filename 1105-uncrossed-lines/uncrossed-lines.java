// Memoization + DP top-down 
class Solution {
    private int memo[][];

    private void initMemoForBC(int[][] memo, int m, int n){
    // initialize memo for Base Condition
        for (int i = 0; i<=m; i++){
            for (int j = 0; j<=n; j++){
                if (i==0 || j == 0) // if length of x, y == 0
                    memo[i][j] = 0; // No matching char
            }
        }
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        this.memo = new int[m+1][n+1]; // need t[m][n]
        initMemoForBC(memo, m, n);
        int i, j;
        for (i = 1; i<=m; i++){ // starting with 1, did the BC with 0
            for (j = 1; j<=n; j++){
                if (nums1[i-1] == nums2[j-1]) //x[i-1] == y[j=1]
                    memo[i][j] = 1 + memo[i-1][j-1];
                else
                    memo[i][j] = Math.max(memo[i][j-1], memo[i-1][j]);
            }
        }
        return memo[m][n];
    }
}