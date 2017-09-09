class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> aux_st;
    private int min;
    
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
        aux_st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        st.push(x);
        if (x <= min) {
            min = x;
            aux_st.push(min);
        }
    }
    
    public void pop() {
        int out = st.pop();
        if (min == out) {
            aux_st.pop();
            if (!aux_st.isEmpty()) min = aux_st.peek();
            else min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
