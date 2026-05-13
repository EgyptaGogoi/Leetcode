class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> hs = new HashSet <Character>();
        int max_ss = 0;
        // char newS[] = s.toCharArray();
        // for (char c : newS){
        //     if (!hs.contains(c)){
        //         hs.add(c);
        //         if (hs.size()>max_ss)
        //             max_ss = hs.size();
        //     }
        //     else{
        //         hs.clear();
        //         hs.add(c);
        //     }
        // }
        int k = 0;
        for (int i = 0; i< s.length(); i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(k));
                k+=1;
            }
            hs.add(s.charAt(i));
            max_ss = Math.max(max_ss, i-k+1);
        }
        return max_ss;
    }
}