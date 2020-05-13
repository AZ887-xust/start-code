/*class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
}*/
public class MyQueue {
    public Node front;
    public Node rear;
    int usedSize;
    public boolean offer(int val){
        Node node = new Node(val);
        if(this.front == null){
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
        return true;
    }
    public int poll(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return this.front.data;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("栈空");
        }
        return this.front.data;
    }
    public boolean isEmpty(){
        return usedSize == 0;
    }
    public int size(){
        return usedSize;
    }
}
