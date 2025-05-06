class Solution {
    public int maxArea(int[] height) {
        if(height.length==2)
            return Math.min(height[0],height[1]);
        int L,R,area=0,h,b,n=height.length,mid;
        L=0; 
        R=n-1;
        // mid=(R-L)/2+L;
        // R=mid;
        // L=mid-1;
        System.out.println(R);
        
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
            System.out.println(area);

        }
        return area;
    }
}