/*
	Similar to the other question
*/
	class MyStack {
    Queue<Integer> stack = new LinkedList<Integer>();
    Queue<Integer> temp = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        while (!stack.isEmpty())
            temp.add(stack.remove());
        stack.add(x);
        while (!temp.isEmpty())
            stack.add(temp.remove());
    }

    // Removes the element on top of the stack.
    public void pop() {
        stack.remove();
    }

    // Get the top element.
    public int top() {
        return stack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}