import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test36 {
    //字母统计
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();

            Map<Character,Integer> map = new HashMap<>();
            for (int i = 'A'; i <= 'Z' ; i++) {
                map.put((char)i,0);
            }

            for (int i = 0; i < str.length(); i++) {
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
            }
            for (int i = 'A'; i <= 'Z' ; i++) {
                System.out.println((char)i+":"+map.get((char)i));
            }

        }
    }
    //十六进制转十进制
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            str = str.substring(2);
            String ret = Integer.valueOf(str, 16).toString();
            System.out.println(ret);
        }
    }
}
