package edu.hrbeu.d1_abstract_use;

public class test {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Dog d1=new Dog();

        c1.setName("哈基米");
        d1.setName("哈基");

        c1.action();
        d1.action();//抽象类继承目的是为了继承多态
    }



}
