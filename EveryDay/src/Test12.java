/*
public abstract class Test12 {
    public int constInt =5;
    public abstract void amethod(){}//抽象方法不能有主体
    public void method(){

    }
}
*/

public class Test12{
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[1] = AB[0] + AB[1];
        AB[0] = AB[1]-AB[0];  //AB[1]
        AB[1] = AB[1]- AB[0];
        return AB;
    }
    public static void main(String[] args) {

    }
}