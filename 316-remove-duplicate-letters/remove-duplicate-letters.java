class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> lastO = new HashMap<>();
        Stack<Character> st= new Stack<>();
        int i;
        for(i = s.length() - 1; i>=0; i--){
            if(!lastO.containsKey(s.charAt(i)))
                lastO.put(s.charAt(i),i);
        }
        for(i = 0; i<s.length(); i++){
            while(!st.isEmpty() && (st.peek() > s.charAt(i)) && st.search(s.charAt(i))==-1){
                if(lastO.get(st.peek()) > i)
                    st.pop();
                else
                    break;
            }
            if(st.isEmpty() || st.search(s.charAt(i))== -1)
                st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) 
            sb.append(ch);
        return sb.toString();  
    }
}