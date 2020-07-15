import java.util.*;

public class Test06 {
    //A-B,B-C,A+B,B+C.求 A B C
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int A = (n1+n3)/2;
        int B = (n2+n4)/2;
        int C = n4-B;
        if((n3-n1)/2 !=(n2+n4)/2){
            System.out.println("No");
        }else {
            System.out.print(A + " " + B + " " + C);
        }
    }
//输入n个整数，输出出现次数大于等于数组长度一半的数。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String s=scanner.nextLine();
            String [] str=s.split(" ");
            Integer [] arr= new Integer[str.length];
            for(int i=0;i<str.length;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            System.out.println(bigThanHalf(arr,arr.length));
        }
    }
    public static int bigThanHalf(Integer [] arr,int n){
        List<Integer> list= Arrays.asList(arr);//注意arr必须不能是int，需要传对象的包装类Integer
        HashSet<Integer> set = new HashSet<>(list);
        for(Integer i:set){
            int count=0;
            for(int j:list){
                if(j==i){
                    count++;
                }
            }
            if(count>=(n/2)){
                return i;
            }
        }
        return 0;
    }
}
