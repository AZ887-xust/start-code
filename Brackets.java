import java.util.Stack;

public class Brackets {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch =='(' || ch =='[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;
                }
                char ch2 = stack.peek();
                if(ch2 == '(' && ch ==')' || ch2 == '[' && ch ==']'||ch2 == '{' && ch =='}'){
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
