public class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> aux_queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        aux_queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(queue.size() > 1) {
            aux_queue.add(queue.poll());
        }
        int top = queue.poll();
        while(!aux_queue.isEmpty()) {
            queue.add(aux_queue.poll());
        }
        return top;
    }
    
    /** Get the top element. */
    public int top() {
        while(queue.size() > 1) {
            aux_queue.add(queue.poll());
        }
        int top = queue.poll();
        while(!aux_queue.isEmpty()) {
            queue.add(aux_queue.poll());
        }
        queue.add(top);
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty() & aux_queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
