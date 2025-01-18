class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length())
            return false;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm.getOrDefault(s.charAt(i),0)>=0){
                int temp= hm.getOrDefault(s.charAt(i),0);
                hm.put(s.charAt(i),temp+1);
            }
                
        }
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(t.charAt(i)))
            {
                int temp= hm.get(t.charAt(i));
                hm.put(t.charAt(i),temp-1);
                if(hm.get(t.charAt(i))==0)
                    hm.remove(t.charAt(i));
            }
        }
        if(hm.size() == 0){
            return true;
        }
        return false;
    }
}