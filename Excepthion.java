class Person{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
public class Excepthion {
    public static void func1(int x){
        if(x==10) {
            throw new MyException("x==10");
        }
    }
    public static void main(String[] args) {
        try{
            func1(10);
        }catch (MyException e){
            e.printStackTrace();
        }
    }


    public static void main5(String[] args) {
        Person person = new Person();
        try {
            Person person1 = (Person)person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static int divide(int x,int y) throws ArithmeticException{
        if(x == 0){
            //自定义异常
            throw new ArithmeticException("y==0");
        }
        return x/y;
    }
    public static void main4(String[] args) {
        try{
            int ret = divide(20,0);
            System.out.println(ret);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void func() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }
    public static void main3(String[] args) {
        try {
            func();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }


    public static void main2(String[] args) {
        int[] array ={1,2,3};
        try{
            System.out.println(array[4]);
            System.out.println("11");//上一行有异常不会执行这一行
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界");
        }
        catch (NullPointerException e){
            System.out.println("捕获到了空指针越界");
        }
        finally {
            System.out.println("finally块的代码肯定会被执行,关闭资源，善后工作");
        }
        System.out.println("hello");
    }
    public static void main1(String[] args) {
        int[] array ={1,2,3};
        try{
            System.out.println(array[4]);
            System.out.println("11");//上一行有异常不会执行这一行
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界或空指针异常");
        }
        System.out.println("hello");
    }


}

