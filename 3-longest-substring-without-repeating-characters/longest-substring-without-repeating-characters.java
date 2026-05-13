class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window will be on hashset not on s
        HashSet <Character> hs = new HashSet <Character>();
        int max_ss = 0;
        int l = 0;

        for (int i = 0; i< s.length(); i++){
            while(hs.contains(s.charAt(i))){ //removing each element from left
                hs.remove(s.charAt(l));
                l+=1;
            }
            hs.add(s.charAt(i));
            max_ss = Math.max(max_ss, i-l+1);
        }
        return max_ss;
    }
}