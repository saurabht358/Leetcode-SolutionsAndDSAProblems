// Using Stack Class from Java Collection Framework
class MyQueue {
    private Stack<Integer> data;
    private Stack<Integer> helper;
    public MyQueue() {
        data = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
    }
    
    public int pop() {
        while(!data.isEmpty()){
            helper.push(data.pop());
        }
        int removed =helper.pop();
        while(!helper.isEmpty()){
            data.push(helper.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!data.isEmpty()){
            helper.push(data.pop());
        }
        int peek =helper.peek();
        while(!helper.isEmpty()){
            data.push(helper.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return data.isEmpty();
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

// Creating Our Own Stacks;

class MyQueue {
    int[] data;
    int[] helper;
    int top1,top2;
    public MyQueue() {
        data = new int[100];
        helper = new int[100];
        top1 = -1;
        top2 = -1;
    }
    
    public void push(int x) {
        data[++top1] = x;
    }
    
    public int pop() {
        while(top1>=0){
            helper[++top2] = data[top1--];
        }
        int popped = helper[top2];
        top2--;
        while(top2>=0){
            data[++top1] = helper[top2--];
        }
        return popped;
    }
    
    public int peek() {
        return data[0];
    }
    
    public boolean empty() {
        return top1==-1;
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
