package edu.hrbeu.d_extends;

public class B extends A {
    private  int k;


    public void print3() {
        System.out.println(i);   //子类可以继承父类非私有成员
        print1();
    }

}//子类对象的创建特点，有父类和子类共同创建，但是能访问什么对象得看权限
