

import java.util.Scanner;

public class Test07 {
    //二货小易有一个W*H的网格盒子，网格的行编号为0~H-1,网格的
    //列编号为0~W-1。 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
    //对于两个格子坐标(x1,y1 ),(x2,y2)的欧几里得距离为:( (x1-x2)* (x1-x2) + (y1-y2)* (y1-y2) )的算术平方根
    //小易想知道最多可以放多少块蛋糕在网格盒子里。
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        if(W%4 == 0 || H%4 ==0){
            System.out.println((W*H)/2);
        }else
            System.out.println((W*H)/2+1);
    }
    //正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值，
    // 求输入A和B的最小公倍数。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println((A*B)/func(A,B));
    }
    public static int func(int n1,int n2){
        while(n1%n2 != 0){
            int n3 = n1%n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
