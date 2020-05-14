import java.util.Queue;
import java.util.Stack;

public class StacktoQueue<stack> {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StacktoQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public int pop(){
        if(empty()){
            return -1;
        }
        if(stack2.empty()) {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(empty()){
            return -1;
        }
        if(stack2.empty()) {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public boolean empty(){
        return stack1.empty() && stack2.empty();
    }
}
