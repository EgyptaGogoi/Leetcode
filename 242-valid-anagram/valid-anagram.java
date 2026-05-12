class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
            char key = entry.getKey();

            if (!hm2.containsKey(key) || 
                !hm2.get(key).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}