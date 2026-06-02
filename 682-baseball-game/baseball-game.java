class Solution {
    public int calPoints(String[] ops) {
        Deque <Integer> stack = new ArrayDeque<>();
        for(String e: ops){
            if(e.equals("+")){
                int top = stack.pop();      
                int second = stack.peek();
                int newScore = top + second;
                stack.push(top);
                stack.push(newScore);
            }
            else if(e.equals("C"))
                stack.pop();
            else if(e.equals("D"))
                stack.push(2*(stack.peek()));
            else
                stack.push(Integer.parseInt(e));
        }
        int sum =0;
        for (int e: stack){
            sum += e;
        }
        return sum;

    }
}