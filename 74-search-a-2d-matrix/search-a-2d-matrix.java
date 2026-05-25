class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = (matrix[0].length)*(matrix.length)-1;
        int mid = 0;
        while(l<=r){
            mid = l + (r-l)/2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
}