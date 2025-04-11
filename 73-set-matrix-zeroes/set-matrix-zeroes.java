class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int i,j;
        HashSet <Integer> zeros_i = new HashSet<>();
        HashSet <Integer> zeros_j = new HashSet<>();
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(matrix[i][j]==0){
                   zeros_i.add(i);
                   zeros_j.add(j);
                }
            }
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(zeros_i.contains(i) || zeros_j.contains(j))
                   matrix[i][j]=0;
            }
        }
    }
}