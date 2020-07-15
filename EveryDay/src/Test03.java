import java.util.Scanner;
import java.util.Stack;

/*
class Base{
    public Base(){
        System.out.print("B");
    }
}

class Derived extends Base{
    public Derived(String s){
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Derived("C");
    }
}*/
/*
class Person{
    private String name ="Person";
    int age = 0;
}
class Child extends Person{
    public static void main(String[] args) {
        Person p =new Child();
        System.out.println(p.name);
    }
}*/
public class Test03 {
    /**
     * 读入一个字符串str，输入字符串str中的连续最长的数字串
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        int count = 0;
        String ret = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= '0' && array[i] <= '9'){
                count =1;
                int index = i;
                for (int j = i+1; j < array.length; j++) {
                    if(array[j] >= '0' && array[j] <= '9'){
                        count++;
                        index = j;
                    }else{
                        break;
                    }
                }
                if(count > ret.length()){
                    ret = str.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(ret);
    }

    /**
     * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
     * 给定一个字符串A和它的长度n, 请返回一个bool值代表它是否为一个合法的括号串。
     * 一个合法的括号串定义为: 1 .只包括括号字符; 2.左括号和右括号一一对应
     */
    public boolean chkParenthesis(String A, int n) {
        // write code here
        char[] arr = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            if(arr[i] != '(' && arr[i] != ')'){
                return false;
            }
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <A.length() ; i++) {
            char ch = A.charAt(i);
            if(ch =='('){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;
                }
                char ch2 = stack.peek();
                if(ch2 == '(' && ch ==')'){
                    stack.pop();
                }else{
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("左括号多");
            return false;
        }
        return true;
    }
}