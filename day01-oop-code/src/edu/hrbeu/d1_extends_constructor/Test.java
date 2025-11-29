package edu.hrbeu.d1_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //目标搞清楚子类构造器的特点
        Wolf w1=new Wolf();//子类无参构造器会先调用父类的无参构造器
        Wolf w2=new Wolf("狼");//子类的有参构造器也会先调用父类的无参构造器
    }
}
