class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int img=image[sr][sc];
        int row=image.length,col=image[0].length;
        image[sr][sc]=color;
        if(img==color){
            return image;
        }
        if(sr<row-1)
            if(image[sr+1][sc]==img)
                floodFill(image,sr+1,sc,color);
        if(sr>0)
            if(image[sr-1][sc]==img)
                floodFill(image,sr-1,sc,color);
        if(sc<col-1)
            if(image[sr][sc+1]==img)
                floodFill(image,sr,sc+1,color);
        if(sc>0)
            if(image[sr][sc-1]==img)
                 floodFill(image,sr,sc-1,color);
        return image;
    }
}