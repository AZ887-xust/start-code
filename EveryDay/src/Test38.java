import java.util.Scanner;

public class Test38 {
    public  String replaceSpace(String iniString, int length) {
        // write code here
        String ret = "";
        for (int i = 0; i < length; i++) {
             ret = iniString.replace(" ","%20");
        }
        return ret;
    }

    public int getLCA(int a, int b) {
        // write code here
        while(a != b){
            if(a>b){
                a/=2;
            }
            if(b>a){
                b/=2;
            }
        }
        return a;
    }


}
