import java.util.Scanner;

public class Test24 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();//怪兽数量
            int a = scanner.nextInt();//初始能力
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(func2(arr,a));
        }
    }
    public static int func2(int[] arr, int a ){
        for (int i = 0; i < arr.length; i++) {
            if (a > arr[i]) {
                a += arr[i];
            } else {
                a += func(a, arr[i]);
            }
        }
        return a;
    }
   // 最大公约数
    public static int func(int a ,int b){
        if(a<b){ //如果a<b，先把ab交换，方便以后操作
            int tmp=a;
            a=b;
            b=tmp;
        }
        int c = a%b;
        while (a%b != 0) {

                a = b;
                b = c;
                c = a%b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

    }
}
