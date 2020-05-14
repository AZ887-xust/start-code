import java.util.LinkedList;
import java.util.Queue;

public class QueuetoStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public QueuetoStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        if(queue1.isEmpty()){
            queue1.offer(x);
        }else if(queue2.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }
    public int pop(){
        if(empty()){
            return -1;
        }
        int data = 0;
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        if(!queue1.isEmpty()){
            while(qSize1!=1) {
                queue2.offer(queue1.poll());
            }
            return queue1.peek();
        }else {
            while(qSize2!=1) {
                queue1.offer(queue2.poll());
            }
            return queue2.peek();
        }
    }
    public boolean empty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

}
