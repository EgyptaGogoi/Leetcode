class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char newSt[] = newS.toCharArray();
        int i=0, j=newSt.length-1;
        while(i<j){
            if (newSt[i] != newSt[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}