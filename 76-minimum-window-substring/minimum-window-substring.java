class Solution {
    public boolean isSame(HashMap <Character, Integer> s, HashMap <Character, Integer> t){
        for(Map.Entry<Character, Integer> e : t.entrySet()){
            char key = e.getKey();
            int val = e.getValue();
            if(val > s.getOrDefault(key,0))
                return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> tfreq = new HashMap<>();
        String ans = new String("");
        int min_ss = Integer.MAX_VALUE;
        int i,j=0;
        for(i = 0; i<t.length(); i++){
            tfreq.put(t.charAt(i), tfreq.getOrDefault(t.charAt(i),0)+1);
        }
        for(i = 0; i<s.length(); i++){
            // update frequency map
            if (tfreq.containsKey(s.charAt(i)))
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i),0)+1);
            //sinking
            while((!freq.containsKey(s.charAt(j)) || freq.get(s.charAt(j))-1 >= tfreq.get(s.charAt(j))) && (j < i)){
                if(freq.containsKey(s.charAt(j)))
                    freq.put(s.charAt(j), freq.get(s.charAt(j))-1);
                j++;
            }
            // check and update min
            if(isSame(freq, tfreq)){
                int curr_min = i-j+1;
                if(min_ss > curr_min){
                    min_ss = curr_min;
                    ans = s.substring(j, i+1);
                }
            }
        }
        return ans;
    }
}