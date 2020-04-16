import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Person {
    //访问修饰限定符：public private protected
    //字段->成员变量  定义在方法外边 ，类的里面
    //实例成员变量：对象里面
    //实例成员变量没有初始化，默认值为对应的0值，引用类型为NULL，简单类型为0.一般不初始化
    public String name; //NULL
    public int age;//0
    //静态成员变量不属于对象，不属于类
    public static int size;
    //方法->行为
    public void eat() {
        int n=0;//局部变量必须初始化
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()");
    }
    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
    public static void func() {
        //静态方法内部不能访问非静态成员和调用非静态方法
        //静态方法属于类，而不属于类的对象。
        //可以直接调用静态方法，而无需创建类的实例。
        //静态方法可以访问静态数据成员，并可以更改静态数据成员的值
        //静态方法里不能调用
        System.out.println("static");
    }

}
class TestDemo{
    public int a;//只要new一次就创建1个
    public static int count;//只有1份
}
public class Test0416 {
    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        TestDemo t1 = new TestDemo();
        t1.a++;//1
        TestDemo.count++;//1
        System.out.println(t1.a);//1
        System.out.println(TestDemo.count);//1
        System.out.println("============");
        TestDemo t2 = new TestDemo();
        t2.a++;//1
        TestDemo.count++;//2
        System.out.println(t2.a);//1
        System.out.println(TestDemo.count);//2

    }



    public static void main1(String[] args) {
        //实例化一个对象 通过关键字 new
        Person per = new Person();
        //. 对象引用成员变量
        System.out.println(per.name);
        //访问静态数据成员：类名.静态成员变量
        System.out.println(Person.size);
        per.eat();//访问成员方法
        Person.func();//访问静态方法
        per.name="qsj";
        per.age=21;
        per.show();
    }
}
