class Solution {
    public int[] plusOne(int[] digits) {
        int i,n=digits.length-1;
        for(i=n; i>=0; i--){
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
                digits[i]=0;
        }
        int arr[]=new int[n+2];
        arr[0]=1;
        return arr;
        //  int flag=0,n=digits.length-1;
        // for(int i=0;i<=n;i++){
        //     if(digits[i]!=9)
        //         flag=1;
        // }
        // if(flag==0){
        //     int arr[]=new int[n+2];
        //     arr[0]=1;
        //     for(int i=1;i<=n+1;i++)
        //         arr[i]=0;
        //     return arr;
        // }
        // else if(digits[n]<9)
        //     digits[n]+=1;
        // else{
        //     digits[n]=0;
        //     int i=n-1; 
        //     while(i>=0 && digits[i]==9 ){
        //         digits[i]=0;
        //         i--;
        //     }
        //     digits[i]+=1;
            
        // }
        // return digits;
    }
}