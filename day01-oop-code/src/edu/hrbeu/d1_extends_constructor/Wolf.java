package edu.hrbeu.d1_extends_constructor;

public class Wolf extends Animal {
    public Wolf(){
        System.out.println("子类的无参构造器被调用了");
    }
    public Wolf  (String n){
        System.out.println("=====子类有参数构造器被调用了===="+n);
    }
}
