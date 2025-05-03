class Solution {
    public int trap(int[] height) {
        int []LG = new int[height.length];
        int []RG = new int[height.length];
        int sum=0,min,i,currg,n=height.length;
        currg=0;
        for(i=0; i<n; i++){
            if(currg>height[i])
                LG[i]=currg;
            else{
                LG[i]=currg;
                currg=height[i];
            }
            // System.out.println(LG[i]);
        }
        currg=0;
        for(i=n-1; i>=0; i--){
            if(currg>height[i])
                RG[i]=currg;
            else{
                RG[i]=currg;
                currg=height[i];
            }
            // System.out.println(RG[i]);
        }
        for(i=0; i<n; i++){
            min=Math.min(LG[i],RG[i]);
            if(min-height[i]>=0)
                sum+=min-height[i];
        }
        return sum;
    }
}