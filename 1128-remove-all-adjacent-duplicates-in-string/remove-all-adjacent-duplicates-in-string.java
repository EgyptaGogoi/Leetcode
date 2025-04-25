class Solution {
    public String removeDuplicates(String s) {
        char[] ans = new char[s.length()];
        int i,curr=-1;
        for(i=0; i<s.length(); i++){
            if(curr>-1 && ans[curr]==s.charAt(i))
                curr--;
            else
                ans[++curr]=s.charAt(i);
        }
        return new String(ans,0,curr+1);
    }
}