package edu.hrbeu.singleinstance;

public class test {
    public static void main(String[] args) {
        //实现单例设计模式
        A a1=A.getInstance();
        A a2=A.getInstance();
    }
}
