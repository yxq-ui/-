package edu.hrbeu.d2_interface_demo2;

public class Test {
    public static void main(String[] args) {
        //接口的多继承

        //一个接口可以同时继承多个接口


    }
}
//接口多继承可以让实现类只实现一个接口就相当于实现了很多个接口

class D implements A,B,C{
    @Override
    public void a(){

    }
    @Override
    public void b(){

    }
    @Override
    public void c(){

    }
}
interface A extends B,C {
    void a();
}
interface B{
    void b();
}
interface C{
    void c();
}
