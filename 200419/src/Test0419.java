import java.util.Arrays;

class Calculator {
    //加减乘除
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1+this.num2;
    }
    public int sub() {
        return this.num1-this.num2;
    }
    public int mul() {
        return this.num1*this.num2;
    }
    public double dev() {
        return this.num1*(1.0)/this.num2;
    }

}

class MyValue {
    //交换数字
    //public int val;
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


}
public class Test0419 {
    public static void main(String[] args) {
        MyArrayList myarr1 = new MyArrayList();
        for (int i = 0; i <10; i++) {
            myarr1.add(i,i);
        }
        myarr1.display();
        /*myarr1.add(10,112);
        myarr1.display();*/

        /*System.out.println("==================");
        System.out.println(myarr1.contains(5));
        System.out.println(myarr1.search(5));
        System.out.println("==================");
        System.out.println(myarr1.getPos(4));
        System.out.println(myarr1.size());*/
        System.out.println("==================");
        myarr1.remove(3);
        myarr1.display();
    }


    //交换数字
    /*public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp=myValue1.val;
        myValue1.val=myValue2.val;
        myValue2.val=tmp;

    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val=10;
        MyValue myValue2 = new MyValue();
        myValue2.val=20;

        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
        swap(myValue1,myValue2);
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }*/
    public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp=myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(tmp);

    }
    public static void main3(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.setVal(10);
        MyValue myValue2 = new MyValue();
        myValue2.setVal(20);

        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }

    //加减乘除
    public static void main2(String[] args) {
        Calculator cal = new Calculator();
        cal.setNum1(10);
        cal.setNum2(20);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.dev());

    }
    //交换数组内容
    public static void func(int[] array,int[] array2) {
        for (int i = 0; i <array.length; i++) {
            int tmp=array[i];
            array[i]=array2[i];
            array2[i]=tmp;
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = {11,22,33,44,55,66};
        func(array,array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }


}
