import java.util.Scanner;
import java.util.Stack;

//两个栈实现一个队列
/*
public class Test05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
*/
public class Test05{
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while(scanner.hasNext()){
            arr = new int[n];
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(func(0, 40));
        }
    }

    public static int func(int i, int sum) {
        if(i==n){
            return 0;
        }
        if(arr[i]==sum){
            return 1+func(i + 1,sum);
        }
        else if(sum>arr[i]) {
            return func(i + 1, sum - arr[i]) + func(i + 1, sum);
        }
        return func(i+1,sum);
    }


}
