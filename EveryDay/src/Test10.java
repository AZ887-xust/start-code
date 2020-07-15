import java.util.Scanner;

public class Test10 {
    /*public int add(int a,int b){
        try{
            return a+b;
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        Test10 test10 = new Test10();
        System.out.println("和是"+test10.add(9,34));
    }*/
    /*public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        b3=(b1+b2);
        //没有final修饰的变量相加后会被自动提升为int型，与目标类型byte不相容，需要强制转换（向下转型
        System.out.println(b3+b6);
    }*/
    /*public static void main(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }*/
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int count1=0;
        int count2=0;
        int num = 0;
        while(num>=0){
            if(Fib(num)>N){
                count1 = Fib(num);
                break;
            }else
                num++;
        }
        count2 = Fib(num-1);
        System.out.println(Math.min(Math.abs(count1-N),Math.abs(count2-N)));
    }
    public static int Fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
    /*
    有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，
    要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
    给定两个正整数int x,int y,请返回机器人的走法数目。保证x + y小于等于12。
     */
    public static int countWays(int x, int y) {
        // write code here
        if(x==1 || y==1 ){
            return 1;
        }
        return countWays(x,y-1)+countWays(x-1,y);
    }

}
