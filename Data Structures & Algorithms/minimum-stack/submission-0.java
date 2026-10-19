class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {

        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }

        stack.push(val);
        
    }
    
    public void pop() {

        if (stack.isEmpty()) return;

        int tmp = stack.pop();

        if (minStack.peek() == tmp) minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
