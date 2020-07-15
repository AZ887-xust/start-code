import java.util.Arrays;
import java.util.Scanner;

public class Test16 {
    /*public static void main(String[] args) {
        int i=0;
        int j=0;
        if((++i>0)||(++j>0)){
            System.out.println(i+"+"+j);//i=1,j=0
        }
    }*/
    /*public static void main(String[] args) {
        int i=5;
        int s = (i++)+(++i)+(i--)+(--i);
        System.out.println(s);
    }*/
    //读入N名学生的成绩，将获得某一给定分数的学生人数输出。
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext() ) {
            int N = scanner.nextInt();
            while (N == 0){
                break;
            }
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            int tar = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == tar){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    //洗牌
    //输入 3  3 1 |1 2 3 4 5 6 ； 3 2 |1 2 3 4 5 6 ； 2 2 |1 1 1 1
    //输出1 4 2 5 3 6 1 5 4 3 2 6 1 1 1 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T != 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[2*n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            T--;
        }
    }

}
