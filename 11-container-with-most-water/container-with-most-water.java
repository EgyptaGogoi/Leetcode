class Solution {
    public int maxArea(int[] height) {
        if(height.length==2)
            return Math.min(height[0],height[1]);
        int L,R,area=0,h,b,n=height.length;
        L=0; 
        R=n-1; 
        while(L<R){
            if(height[R]<=height[L]){
               h=height[R];
                b=R-L;
                if((h*b)>area)
                    area=h*b;
                R--; 
            }
            else{
                h=height[L];
                b=R-L;
                if((h*b)>area)
                    area=h*b;
                L++;
            }
        }
        return area;
    }
}