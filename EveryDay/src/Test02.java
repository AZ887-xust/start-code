import java.lang.reflect.Array;
import java.util.Scanner;


public class Test02 {
    /**
     * 汽水瓶
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n == 0){
                break;
            }
            System.out.println(func(n));

        }
    }
    public static int func(int n){
        int t = 0;
        while(n>2){
            t += n/3;
            n = n%3 + n/3;
        }
        if(n == 2){
            t++;
        }
        return t;
    }
    /**
     *
     */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(func2(array,array.length));
    }
    public static int func2(int[] array,int n){
        int ret = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    ret++;
                }
            }
        }
        return ret;
    }
}


