class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        char[] par = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int i;
        for (i=0; i<par.length ; i++){
            if(par[i]=='{' || par[i]=='[' || par[i]=='(')
                stack.push(par[i]);   
            else if(!stack.isEmpty() && 
            (par[i]=='}'&& stack.peek()=='{' || 
                    par[i]==']'&& stack.peek()=='[' ||
                    par[i]==')'&& stack.peek()=='(')){
                        stack.pop();
            }   
            else
                return false; 
        }
        System.out.print(stack);
        return stack.isEmpty();
                
    }
}