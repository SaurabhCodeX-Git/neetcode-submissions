class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                result = Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop());
                stack.push(String.valueOf(result));
            } else if(tokens[i].equals("-")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                result = a-b;
                stack.push(String.valueOf(result));
            } else if(tokens[i].equals("*")){
                result = Integer.valueOf(stack.pop()) * Integer.valueOf(stack.pop());
                stack.push(String.valueOf(result));
            } else if(tokens[i].equals("/")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                result = a/b;
                stack.push(String.valueOf(result));
            }
            else{
                stack.push(tokens[i]);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
