import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test04 {
    //小易买苹果
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }
    public static int func(int n){
        if(n%2 ==1){
            return -1;
        }
        int a = 0;
        int b = 0;
        for (int i = n/8; i >=0 ; i--) {
            if((n-8*i)%6 == 0){
                a = (n-8*i)/6;
                b = i;
                break;
            }
        }
        return a+b;
    }
    //输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] ch = scanner.nextLine().toCharArray();
            String str = scanner.next();
            for (int i = 0; i < ch.length; i++) {
                if (!str.contains(String.valueOf(ch[i]))) {
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
