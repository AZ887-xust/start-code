
import java.util.Arrays;
import java.util.Scanner;
public class Test27 {
    public static void main1(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n <1 || n> 200){
                continue;
            }
            int [] num = new int [n];
            for(int i = 0; i <num.length; i ++){
                num [i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int j = 0;
            for(; j <num.length; j ++){
                if(x == num [j]){
                    System.out.print(j);
                    break;
                }
            }
            if(j == num.length){
                System.out.print(-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ipAddress = scanner.nextLine();
            String n = scanner.nextLine();
            System.out.println(ipToTen(ipAddress));
            tenToIp(n);
        }
    }
    public static long ipToTen(String ipAddress) {
        String[] ip = ipAddress.split(".");
        long n = Long.parseLong(ipAddress);
        for (int i = 0; i < ip.length; i++) {
            n = n<<8;
            n = n+Long.parseLong(ip[i]);
        }
        return n;
    }
    public static void tenToIp(String p) {
        long temp=Long.parseLong(p);
        String ip=Long.toBinaryString(temp);
        StringBuilder sb=new StringBuilder();
        if(ip.length()<32){
            for(int i=0;i<(32-ip.length());i++){
                sb.append(0);
            }
            sb.append(ip);
        }else if(ip.length()==32){
            sb.append(ip);
        }
        for(int i=0;i<sb.length()-8;i=i+8){
            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
        }
        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));

    }
}
