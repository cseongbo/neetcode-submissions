class Solution {

    static Stack<Integer> stack;

    public int evalRPN(String[] tokens) {

        stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                operation(tokens[i]);
            }
        }

        return stack.pop();
        
    }

    static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == '-' && str.length() >= 2) continue;
            if (!Character.isDigit(str.charAt(i))) return false;
        }

        return true;
    }

    static void operation(String op) {

        switch (op) {
            case "+": {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = num1 + num2;
                stack.push(ans);
                break;
            }
            case "-": {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = num1 - num2;
                stack.push(ans);
                break;
            }
            case "*": {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = num1 * num2;
                stack.push(ans);
                break;
            }
            case "/": {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = num1 / num2;
                stack.push(ans);
                break;
            }
        }

    }
}
