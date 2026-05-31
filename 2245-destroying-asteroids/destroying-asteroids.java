class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        long sum = mass;
        for(int i =0; i< a.length; i++){
            if (sum >= a[i]){
                sum += a[i];
                // System.out.println(mass);
            }
            else
                return false;
        }
        return true;
    }
}

// 4 4 9 23
// sum = mass
// mass > current ele    
//     sum += 

// sum = 5
// mass > 4
//     sum += 4 (9)
//     sum < 4 no
// mass > 4
//     sum += 4(9+4 = 13)
//     13<9 no
// mass > 9
//     sum += 9(13+9 =22) 
//     22 < 23 yes
        // return false


