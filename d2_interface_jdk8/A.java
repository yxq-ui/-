package edu.hrbeu.d2_interface_jdk8;

import javax.swing.*;
import javax.xml.transform.Source;

public interface A {
    //没加defau所以报错，因为不是抽象方法
    public default void run(){
        System.out.println("跑起来了");

    }//加上了default之后不再报错，默认就是公开方法因此public可以不写。
    default void b(){

    };

    //2.私有方法JDK9之后有
    private void go(){
        System.out.println("私有方法");
    }
    //3.静态方法JDK8
    static void inaddr(){
        System.out.println("静态方法");
    }//接口的静态方法必须用接口名本身来调
}
