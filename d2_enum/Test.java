package edu.hrbeu.d2_enum;

public class Test {
    public static void main(String[] args) {
        //枚举类构造器私有 A a=new A();会报错
        A a1=A.X;
        A a2=A.Y;//常量可以直接调用



        A[] as=A.values();//拿到枚举类的所有对象放到一个数组里面
        

    }
}
