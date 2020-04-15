import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeWork {


    public static void main(String[] args) {
        int[] array= {1,2,3};
        int[] array2=transform(array);
        //System.out.println(avg(array));
        //System.out.println(ArraySum(array));
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(transform(array)));

    }

    public static int[] transform(int[] array) {
        for(int i=0;i<array.length;i++) {
            array[i]=array[i]*2;
        }
        return array;
    }
    public static int ArraySum(int[] array) {
        int i=0;
        int sum =0;
        for(i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }
    public static double avg(int[] array) {
        int i=0;
        int sum =0;
        for(i=0;i<array.length;i++) {
            sum += array[i];
        }
        return (double)sum/array.length;
    }

    public static void main24(String[] args) {
        int n=10;
        System.out.println(RecursiveAdd(n));
    }
    public static int RecursiveAdd(int n) {
        if(n==1)
            return 1;
        else
            return n+RecursiveAdd(n-1);
    }

    public static void main23(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DigitSum(n));
    }
    public static int DigitSum(int n) {
        if(n<10)
            return n;
        else
            return n%10+DigitSum(n/10);
    }

    public static void main22(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FrogJump(n));
    }
    public static int FrogJump(int n) {
        if(n==1) {
            return 1;
        }
        else if(n==2) {
            return 2;
        }
        else
            return FrogJump(n-1)+FrogJump(n-2);
    }

    public static void main21(String[] args) {
        int a=10;
        int b=20;
        double c=10.1;
        double d=20.1;
        double e=30.1;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d, e));
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static double sum(int a,double b,double c) {
        return Math.max(a,Math.max(b,c));
    }

    public static void main20(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(max2(n1,n2));
        System.out.println(max3(n1,n2,n3));

    }
    public static int max2(int n1,int n2) {
        return Math.max(n1, n2);
    }
    public static int max3(int n1,int n2,int n3) {
        return Math.max(max2(n1,n2),n3);
    }

    public static void main19(String[] args) {
        int[] array = {1,2,3,4,5};
        ArraySequence(array);
    }
    public static void ArraySequence(int[] array) {
        int left=0;
        int i=array.length;
        int right=array.length-1;
        while(left<right) {
            while (left<right&&array[left]%2 == 0) {
                left++;
            }
            while(left<right&&array[right]%2 == 1) {
                right--;
            }
            int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main18(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        //阶乘和
        int sum=0;
        int i=n;
        for(i=n;i>0;i--) {
            sum += Sum(i);
        }
        return sum;
    }

    public static void main17(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
    public static int Sum(int n) {
        //递归求阶乘
        if(n == 1) {
            return 1;
        }
        return n*Sum(n-1);
    }

    public static void main16(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci(int n) {
        if(n == 1 || n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main15(String[] args) {
        int[] array ={1,2,2,3,3,4,4};
        System.out.println(Find(array));
    }
    public static int Find(int[] array) {
        for (int tmp : array) {
            for (int value : array) {
                if (value == tmp)
                    return tmp;
            }
        }
        return 0;
    }

    public static void main14(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            int j=1;
            for(j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main13(String[] args) {
        //倒序打印
        int n=123;
        while(n!=0) {
            System.out.println((n%10)+" ");
            n/=10;
        }
    }
    public static void Print1(int n) {
        //正序输出数字的每一位
        if(n < 10) {
            System.out.println(n);
        }
        else {
            Print1(n / 10);
            System.out.println(n % 10);
        }
    }
    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print1(n);

    }
    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=3;
        while(count!=0) {
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if(password.equals("123")) {
                System.out.println("登陆成功");
                break;
            }
            else{
                count--;
                System.out.println("密码错误，你还有"+count+"次机会");
            }
        }
    }

    public static void main10(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=31;i>=1;i-=2) {
            System.out.print(((n>>i)&1)+" "); //模1才能显示二进制序列
        }
        System.out.println();
        for(int i=30;i>=0;i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=31;i>=0;i--) {
            if(((n>>i)&1) == 1)
                count++;
        }
        System.out.println(count);

    }
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a%b != 0){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println((b));
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main7(String[] args) {
        double sum=0;
        int flag=1;
        for(int i=1;i<=100;i++) {
            sum += flag*(1.0/i);
            flag=-flag;
        }
        System.out.println((sum));
    }
    public static void main6(String[] args) {
        int i=0;
        for(i=1;i<1000;i++) {
            int count=0;
            int tmp=i;
            while(tmp != 0) {
                tmp = tmp/10;
                count++;
            }
            tmp = i;
            int sum=0;
            while(tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum==i) {
                System.out.println((sum + " "));
            }
        }
    }
    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randNum = random.nextInt(100);

        while(true) {
            System.out.println(("请输入数字："));
            int n = sc.nextInt();
            if (n > randNum) {
                System.out.println(("猜大了"));
            } else if (n < randNum) {
                System.out.println(("猜小了"));
            } else {
                System.out.println(("猜对了"));
                break;
            }
        }
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 18) {
            System.out.println(("是少年"));
        }
        else if ((n >= 19) &&(n <= 28)) {
            System.out.println(("是青年"));
        }
        else if ((n >= 29) && (n <= 55)) {
            System.out.println(("是中年"));
        }
        else if (n >= 56)  {
            System.out.println(("是老年"));
        }
    }
    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        for(i=1;i<n;i++)
        {
            int j = 2;
            for (; j <= (int)Math.sqrt(i) ;j++ ) {
                if(i % j == 0) {
                    //System.out.println(n+"  不是素数！");
                    break;
                    }
                }
                if(j > (int)Math.sqrt(i)) {
                    System.out.println(i+" ");
            }
        }
    }
    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        int year=0;
        for(year=1000;year<=2000;year++) {
            if((year%400 ==0)||((year%4==0)&&(year%100!=0)))
            {
                System.out.println(year);
            }
        }

    }
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int i=0;
        int count=0;
        for(i=1;i<=100;i++) {
            if((i%10)==9)
            {
                count++;
            }
            if((i/10)==9)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
