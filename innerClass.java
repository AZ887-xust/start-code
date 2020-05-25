//实例内部类:看作是一个普通实例数据成员
class OuterClass{
    public int data1 = 1;
    public static int data2 = 2 ;

    class InnerClass {
        public int data1 = 11;
        public int data3 = 3;
        public static final int a = 99;//final是编译时期确定
        public void func(){
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();

    }
}
