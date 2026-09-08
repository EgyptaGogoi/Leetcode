class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] sort_str = s.toCharArray();
            Arrays.sort(sort_str);
            String ss = new String(sort_str);
            if (!hm.containsKey(ss))
                hm.put(ss, new ArrayList<>(List.of(s)));
            else
                hm.get(ss).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}