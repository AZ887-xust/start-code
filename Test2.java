/**
 * Created with IntelliJ IDEA.
 * Description:
 *  封装：用private来修饰属性 或者 方法
 *  为什么要封装：
 *   没有特殊的要求，那么属性都设置为私有的
 *  this:  当前对象的   引用
 *  要习惯使用this
 * User: GAOBO
 * Date: 2020-04-16
 * Time: 20:56
 */
class Student {
    //限定你只能在类当中进行访问
    private String name;
    private int age;
    //alt+insert(f12)  自定义
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*//提供一个公开的接口
    public String getMyName() {
        return this.MyName;
    }

    public void setMyName(String MyName) {
        this.MyName = MyName;//其实就是 自己给自己赋值  并没有赋值属性  局部变量优先
    }*/

    private void func1() {
        System.out.println("func1()");
    }
    public void show() {
        System.out.println("我叫" + this.name + ", 今年" + this.age + "岁");
    }

    //重新 实现了一下 Object类的 toString()方法
    //Object  是 所有类的父类  alt + insert  ->toString()
    @Override//注解：这个注解指的是  这个方法是重新写的
    public String toString() {
        return "Student{" +
                "我叫：" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现着写的代码

//以下是类的调用者
public class Test20416 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("gaobo");
        String str = student.getName();
        System.out.println(str);
        //student.show();
        System.out.println(student);

        /*String str2 = student.toString();
        System.out.println(str2);*/
    }
}
