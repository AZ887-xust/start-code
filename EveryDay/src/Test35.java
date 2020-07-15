
public class Test35 {
    public static void main1(String[] args) {
        long a = 10*30;
        long b = 0;
        for (int i = 0; i < 30; i++) {
            b += Math.pow(2,i);
        }
        System.out.print(a+" ");
        System.out.println(b);
    }

    /*public static void main(String[] args) {

        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;

        for (int curPrice : prices) {
            firstBuy = Math.max(firstBuy, -curPrice);
            firstSell = Math.max(firstSell, firstBuy + curPrice);
            secondBuy = Math.max(secondBuy,firstSell - curPrice);
            secondSell = Math.max(secondSell, secondBuy + curPrice);
        }
        return secondSell;
    }*/
}
