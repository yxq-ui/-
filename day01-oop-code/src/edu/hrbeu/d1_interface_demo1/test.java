package edu.hrbeu.d1_interface_demo1;

public class test {
    public static void main(String[] args) {
        //目标：了解接口的好处
        //1.弥补了单继承的不足,让一个对象拥有更多的角色
        People s1=new Student();
        Driver d=new Student();
        Doctor d1=new Student();


        //2.面向接口编程是目前软件开发中流行的开发模式，可以更灵活的实现解耦合
        Doctor d2=new Teacher();
        Doctor d3=new Student();

    }
}
