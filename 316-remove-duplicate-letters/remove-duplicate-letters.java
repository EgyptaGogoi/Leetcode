class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> lastO = new HashMap<>();
        Stack<Character> st= new Stack<>();
        int i;
        for(i = s.length() - 1; i>=0; i--){
            if(!lastO.containsKey(s.charAt(i)))
                lastO.put(s.charAt(i),i);
        }
        Set<Character> visited = new HashSet<>();
        for(i = 0; i<s.length(); i++){
            if(visited.contains(s.charAt(i)))
                continue;
            while(!st.isEmpty() && (st.peek() > s.charAt(i))){
                if(lastO.get(st.peek()) > i){
                    visited.remove(st.pop());
                }  
                else
                    break;
            }
            st.push(s.charAt(i));
            visited.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) 
            sb.append(ch);
        return sb.toString();  
    }
}