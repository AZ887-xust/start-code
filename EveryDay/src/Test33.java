/*import java.util.Scanner;

public class Test33 {
    private static int win = 0;
    private static int lost = 0;
    private static int AnumC=0;
    private static int AnumB=0;
    private static int AnumJ=0;
    private static int BnumC=0;
    private static int BnumB=0;
    private static int BnumJ=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        func(arr);
        int tie = 10-win-lost;
        System.out.println(win+" "+tie+" "+lost);
        System.out.println(lost+" "+tie+" "+win);
        System.out.println(func2()+" "+ func2());
    }
    private static void func(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("C J") || arr[i].equals("B C") || arr[i].equals("J B")){
                win++;
                if(arr[i].equals("C J")){
                    AnumC++;
                }if(arr[i].equals("B C")){
                    AnumB++;
                }if(arr[i].equals("J B")){
                    AnumJ++;
                }
            }else if(arr[i].equals("C B") || arr[i].equals("B J") || arr[i].equals("J C")){
                lost++;
                if(arr[i].equals("C B")){
                    BnumB++;
                }if(arr[i].equals("B J")){
                    BnumJ++;
                }if(arr[i].equals("J C")){
                    BnumC++;
                }
            }
        }
    }
    private static String func2(){
        if(Math.max(AnumB,Math.max(AnumC,AnumJ)) == AnumB || Math.max(BnumB,Math.max(BnumC,BnumJ)) == BnumB){
            return "B";
        }
        else if(Math.max(AnumB,Math.max(AnumC,AnumJ)) == AnumC || Math.max(BnumB,Math.max(BnumC,BnumJ)) == BnumC){
            return "C";
        }else if(Math.max(AnumB,Math.max(AnumC,AnumJ)) == AnumJ || Math.max(BnumB,Math.max(BnumC,BnumJ)) == BnumJ){
            return "J";
        }
         return null;

    }


}*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 锤子剪刀布
 */
public class Test33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Model mA = new Model();
        Model mB = new Model();

        for (int i = 0; i < N; i++) {
            String a = sc.next();
            String b = sc.next();
            judge(a, b, mA, mB);
        }

        System.out.println(mA.win + " " + mA.tie + " " + mA.lose);
        System.out.println(mB.win + " " + mB.tie + " " + mB.lose);
        System.out.println(getMostGen(mA.map) + " " + getMostGen(mB.map));
    }

    public static void judge(String a, String b, Model mA,
                             Model mB) {
        if (a.equals("C")) {
            if (b.equals("C")) {
                mA.tie++;
                mB.tie++;
            } else if (b.equals("J")) {
                mA.win++;
                mB.lose++;
                mA.map.put("C", mA.map.get("C") + 1);
            } else {
                mA.lose++;
                mB.win++;
                mB.map.put("B", mA.map.get("B") + 1);
            }
        } else if (a.equals("J")) {
            if (b.equals("C")) {
                mA.lose++;
                mB.win++;
                mB.map.put("C", mA.map.get("C") + 1);
            } else if (b.equals("J")) {
                mA.tie++;
                mB.tie++;
            } else {
                mA.win++;
                mB.lose++;
                mA.map.put("J", mA.map.get("J") + 1);
            }
        } else {
            if (b.equals("C")) {
                mA.win++;
                mB.lose++;
                mA.map.put("B", mA.map.get("B") + 1);
            } else if (b.equals("J")) {
                mA.lose++;
                mB.win++;
                mB.map.put("J", mA.map.get("J") + 1);
            } else {
                mA.tie++;
                mB.tie++;
            }
        }
    }

    public static String getMostGen(Map<String, Integer> map) {
        if (map.get("C") >= map.get("J")) {
            if (map.get("C") > map.get("B")) {
                return "C";
            } else {
                return "B";
            }
        } else {
            if (map.get("J") > map.get("B")) {
                return "J";
            } else {
                return "B";
            }
        }
    }

    static class Model {
        int win;
        int tie;
        int lose;
        Map<String, Integer> map;

        Model() {
            map = new HashMap<>();
            map.put("B", 0);
            map.put("C", 0);
            map.put("J", 0);
        }
    }
}
