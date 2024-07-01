import java.util.*;

class freqOfchar {
    public static String frequencySort(String s) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        int k=a.length,count=1,mov=0,i;
        int n=1;
        for(i=0;i<k-1;i++)
        {
             if(a[i]!=a[i+1])
                n++;
        }
        //System.out.println(n);
        int fr[]=new int[n];
        char ch[]=new char[n];
        mov=0;
        ch[mov]=a[0];
        fr[mov]=1;
        for(i=0;i<k-1;i++){
            if(a[i]==a[i+1]){
                fr[mov]=++count;
                
            } 
            else
            {
                mov++;
                ch[mov]=a[i+1];
                fr[mov]=1; 
                count=1;
            }
                
        }
        //System.out.println(Arrays.toString(ch));
        int j;
        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(fr[j]<fr[j+1]){
                    int t=fr[j+1];
                    fr[j+1]=fr[j];
                    fr[j]=t;
                    char temp=ch[j+1];
                    ch[j+1]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        int c=0;
        i=0;
       //  System.out.println(Arrays.toString(fr));
        // System.out.println(Arrays.toString(ch));
        while(c<n){
            for(j=1;j<=fr[c];j++){
                    a[i]=ch[c];
                    i++;
            }
            c++;
        }

        s=new String(a);
        return s;
    }
    public static void main(String []arg){
        Scanner scan= new Scanner(System.in);
        String st= scan.nextLine();
        System.out.println(frequencySort(st));
        scan.close();
    }
}