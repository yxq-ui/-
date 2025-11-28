package edu.hrbeu.singleinstance;

import java.nio.channels.NonWritableChannelException;
import java.util.PropertyResourceBundle;

public class A {
    //2.定义一个静态变量用于记住类的唯一变量

   private static A a= new A();//1.将这个变量进行私有化防止外部访问对其修改其值

    private A(){}
    public static A getInstance(){
        return a;
    }//2.由于上面对变量私有化，则测试类中无法通过A.a获取到变量，因此在该类里构造一个get方法使得测试类中可以调取相应变量


}
