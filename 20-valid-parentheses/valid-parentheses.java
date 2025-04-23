class Solution {
    public boolean isValid(String s) {
        // if(s.length()%2!=0)
        //     return false;
        Stack<Character> stack = new Stack<>();
        int i,flag=0;
        for (i=0; i<s.length() ; i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                stack.push(s.charAt(i));   
                flag=1;
            }
            else {
                if(stack.isEmpty())
                    return false;
                if(s.charAt(i)=='}'&& stack.pop()!='{' || 
                    s.charAt(i)==']'&& stack.pop()!='[' ||
                    s.charAt(i)==')'&& stack.pop()!='(')
                        return false;  
            }
        }
        return stack.isEmpty();
                
    }
}