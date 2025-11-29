package edu.hrbeu.d1_extends_constructor;

import java.sql.SQLOutput;

public class Animal {
    public Animal(){
        System.out.println("父类无参构造器被调用了");
    }

    public Animal(String n){
        System.out.println("=====父类有参数构造器被调用了===="+n);
    }
}
