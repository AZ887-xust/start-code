import java.util.Scanner;

public class Test28 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int N = scanner.nextInt();
            if(N<2||N>=100){
                break;
            }
            int N2 = N*N;
            int ret = func(N,N2);
            if(ret == N || N == 5 || N==6){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }

        }
    }
    public static int func(int n1,int n){
            int m = n%10;
            n = n/10;
            int p = n%10;
            return p*10+m;

    }

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String N = scanner.next();
            if(!func3(N) && N.length()>2){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean func3(String str){
        if(str.length()>=8){
            if(str.contains())
        }
    }*/

}
