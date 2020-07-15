import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


import static java.lang.Math.abs;
import static java.lang.Math.min;

public class TestDS {
    //N最少需要多少步变成一个斐波那契数
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;
        int num =0;
        while(num>=0){
            if(Fib(num)>=N){
                count1 = Fib(num);
                break;
            }else{
                num++;
            }
        }
        count2 = Fib(num-1);
        System.out.println(min(abs(count1-N), abs(count2-N)));
    }
    public static int Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while(scanner.hasNext()){
            String str = scanner.next();
            hashSet.add(str);
        }
        System.out.println(hashSet.size());
    }

}
