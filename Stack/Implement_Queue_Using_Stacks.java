public class MyQueue {
    private Stack<Integer> st;
    private Stack<Integer> aux_st;

    /** Initialize your data structure here. */
    public MyQueue() {
        st = new Stack<> ();
        aux_st = new Stack<> ();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        aux_st.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(st.isEmpty()){
            while(!aux_st.isEmpty()) {
                st.push(aux_st.pop());
            }
        }
        return st.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(st.isEmpty()) {
            while(!aux_st.isEmpty()) {
                st.push(aux_st.pop());
            }
        }
        return st.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st.isEmpty() & aux_st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
