import java.util.Scanner;

public class Test25 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] credit = new int[n];
        int sumCredit = 0;
        for (int i = 0; i < n; i++) {
            credit[i] = scanner.nextInt();//学分
            sumCredit += credit[i];
        }
        int[] score = new int[n];
        double sumPoint = 0.0;//绩点和
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();//实际成绩
            sumPoint += func(score[i])*credit[i];
        }
        double GPA = sumPoint/sumCredit;
        System.out.printf("%.2f",GPA);
    }
    public static double func(int n){
        if(n>=90 && n<=100){
            return 4.0;
        }else if(n>=85 && n<=89){
            return 3.7;
        } else if(n>=82 && n<=84){
            return 3.3;
        }else if(n>=78 && n<=81){
            return 3.0;
        }else if(n>=75 && n<=77){
            return 2.7;
        }else if(n>=72 && n<=74){
            return 2.3;
        }else if(n>=68 && n<=71){
            return 2.0;
        }else if(n>=64 && n<=67) {
            return 1.5;
        }else if(n>=60 && n<=63) {
            return 1.0;
        }else
            return 0;
    }

    public static void main(String[] args) {
        final String[] hanzi = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double money = sc.nextDouble();
            StringBuffer buffer = new StringBuffer();
            int yi = (int)(money/100000000);
            int wan = (int)((money-yi*100000000)/10000);
            int ge = (int)(money-yi*100000000-wan*10000);
            System.out.print("人民币");
            if(yi != 0){
                buffer.append(change(yi)+"亿");
            }
            if(wan != 0){
                buffer.append(change(wan)+"万");
            }
            if(ge != 0){
                buffer.append(change(ge)+"元");
            }
            int xiaoshu=(int)((money-yi*100000000-wan*10000-ge+0.001)*100);
            int jiao = xiaoshu/10;
            int fen = xiaoshu%10;
            if (jiao!=0&&fen!=0){
                buffer.append(hanzi[jiao]+"角"+hanzi[fen]+"分");
            }else if (jiao!=0&&fen==0){
                buffer.append(hanzi[jiao]+"角");
            }else if (jiao==0&&fen!=0){
                buffer.append(hanzi[fen]+"分");
            }else if (jiao==0&&fen==0){
                buffer.append("整");
            }
            String string = buffer.toString();
            System.out.println(string);
        }
        sc.close();
    }

    private static String change(int a) {
        final String[] hanzi = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
        int qian = a/1000;
        int bai = (a-qian*1000)/100;
        int shi = (a-qian*1000-bai*100)/10;
        int ge = a - qian * 1000 - bai * 100 - shi * 10;
        StringBuffer br = new StringBuffer();
        if (qian != 0){
            br.append(hanzi[qian]+"仟");
        }
        if (bai != 0){
            br.append(hanzi[bai]+"佰");
        }else if (qian!=0&&bai == 0&&(shi!=0||ge!=0)){
            br.append("零");
        }
        if (shi != 0&&shi!=1){
            br.append(hanzi[shi]+"拾");
        }else if (bai != 0 && ge != 0) {
            br.append("零");
        }
        if(shi==1&&qian==0&&bai==0){
            br.append("拾");
        }

        if (ge != 0) {
            br.append(hanzi[ge]);
        }
        String s=br.toString();
        return s;
    }

}
