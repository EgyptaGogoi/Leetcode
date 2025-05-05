class Solution {
    // SIMPLE METHOD OF GCD ARRAY
    // public int gcd(int a, int b){
    //     int min=Math.min(a,b);
    //     for(int i=min; i>=1; i--){
    //         if(a%i==0 && b%i==0)
    //             return i;
    //     }
    //     return 1;
    // }
    public int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1)
            return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        for(i=0; i<deck.length; i++){
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        } 
        int frq[]= new int[hm.size()];
        i=0;
        for (Map.Entry<Integer,Integer> ele : hm.entrySet()) {
              frq[i++]=ele.getValue();
        }
        int g=frq[0];
        for(i=1; i<frq.length; i++){
            g=gcd(g,frq[i]);
        }
        System.out.print(g);
        return g>=2;
    }
}