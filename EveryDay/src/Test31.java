import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test31 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> map=new HashMap<String, Integer>();
        while(sc.hasNext()){
            String str=sc.next();
            int linenum=sc.nextInt();
            String[] arr=str.split("\\\\");  //根据\切割
            String s=arr[arr.length-1];
            if(s.length()>16)  //截取
                s=s.substring(s.length()-16);
            String key=s+" "+linenum;
            int value=1;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else {
                map.put(key, value);
            }
        }
        int count=0;
        for(String string:map.keySet()){
            count++;
            if(count>(map.keySet().size()-8)) //输出最后八个记录
                System.out.println(string+" "+map.get(string));
        }
    }
}
