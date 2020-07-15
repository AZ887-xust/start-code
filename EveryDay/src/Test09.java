import java.util.Scanner;

public class Test09 {
    //输入一个整数，将这个整数以字符串的
    //形式逆序输出
    //程序不考虑负数的情况，若数字含有0,
    //则逆序形式也含有0，如输入为100，则
    //输出为001
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = Integer.toString(n);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse().toString());
    }

    //输入一个正整数n,求n!(即阶乘)末尾有多少个0?比如:n= 10; n! = 3628800,所以答案为2

    /*
    求末尾0的个数，就看这个数有几个10因子，10=5*2，
    但是最后得到的结果2的个数一定多于5的个数，
    所以只需要求5的个数就可以了。
    但是就像25这种数字，它可以被5除两次，
    所以我们要在循环中除以5，最后把除5的个数累加就可以了。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            n /= 5;
            count += n;
        }
        System.out.println(count);
    }

}
