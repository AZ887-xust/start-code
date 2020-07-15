import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = (int) Math.pow(n,2);
            int sum1 = 0;
            int sum2 = 0;
            while(n>0){
                sum1 += n%10;
                n = n/10;
            }
            while(m>0){
                sum2 += m%10;
                m = m/10;
            }
            System.out.print(sum1+" "+sum2);
        }
    }
}
