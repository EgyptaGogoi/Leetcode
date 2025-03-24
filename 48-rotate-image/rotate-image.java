class Solution {
    public void swap(int a, int b, int c, int d, int[][] matrix){
        int temp;
            temp=matrix[a][b];
            matrix[a][b]=matrix[c][d];
            matrix[c][d]=temp;
    }
    public void rotate(int[][] matrix) {
        int i,j,len=matrix.length;
        for(i=0; i<len; i++){
            for(j=len-1; j>=i; j--){
                if(i!=j)
                    swap(i,j,j,i,matrix);
            }
        }
        int c=len-1;
        for(i=0; i<len; i++){
            for(j=0; j<len/2; j++){
                swap(i,j,i,c,matrix);
                c--;
            }
            c=len-1;
        }
    }
}