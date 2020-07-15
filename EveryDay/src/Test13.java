
import java.util.Scanner;

public class Test13 {
    /*static boolean out(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        for(out('A');out('B') && (i<2) ; out('C')){
            i++;
            out('D');
        }//ABDCBDCB
    }*/

    //画正方形
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String C = scanner.next();
        for (int i = 1; i <= N; i++) {
            System.out.print(C);
        }
        System.out.println();

        for (int i = 1; i <=Math.ceil((double)N/2)-2; i++) {
            System.out.print(C);
            for (int j = 2; j <= N-1; j++) {
                System.out.print(" ");
            }
            System.out.println(C);
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(C);
        }
    }
    //超长整个正整数相加
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addend = scanner.nextLine();
        String augend = scanner.next();
        System.out.println(AddLongInteger(addend,augend));
    }
    public static String AddLongInteger(String addend,String augend){
        return null;
    }
}
