package com.bit.test0427;

class Animal{
    protected String name;//protected -- 不同包中，只能是子类才能访问
    int a;//默认权限--只能在同一包中访问
    public Animal(String name) {
        this.name = name;
        System.out.println("animal()");
    }
    public void eat() {
        System.out.println(this.name+"Animal::eat()");
    }
    public void sleep() {
        System.out.println("Animal::sleep()");
    }
}
//继承
class Bird extends Animal{
//子类继承了父类除构造方法外所有
    public Bird(String name){
        super(name);
        super.eat();
        System.out.println(super.name);
    }
    //this:当前对象的引用,必须写在第一行
//super:代表父类对象的引用,必须写在第一行
    //super() 调用父类的构造方法
    //super.data() 调用父类的属性
    //super.func() 调用父类的成员 方法

}
public class test0427 {
    public static void main(String[] args) {
        Animal animal = new Animal("123");
        System.out.println(animal.name);
        Bird bird = new Bird("wood");

    }
}
