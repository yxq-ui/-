package edu.hrbeu.d1_interface;

public interface A {
    //1.接口中定义的只能是常量
    //2.常量默认可以不写public static final
    public static final String SCHOOL_NAME="HEU";

    //2.接口中只能写抽象方法可以生略public abstract
    void run();
    void go();
}
