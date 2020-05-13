import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public int top;

    public MyStack() {
        this.elem = new int[10];
    }
    public void push(int value){
        //1.判断是否为满
        if(full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //2.往里面存放数据
        this.elem[top++] = value;
    }
    public boolean empty(){
        return this.top == 0;
    }
    public boolean full(){
        return this.top == this.elem.length;

    }
    public int pop(){
        if(empty()){
            throw new RuntimeException("栈空");
        }
        int data = this.elem[top-1];
        this.top--;
        return data;
        //return this.elem[this.top-1];
    }
    public int peek(){
        if(empty()){
            throw new RuntimeException("栈空");
        }
        return this.elem[this.top-1];
    }
    public int size(){
        return this.top;
    }

}
