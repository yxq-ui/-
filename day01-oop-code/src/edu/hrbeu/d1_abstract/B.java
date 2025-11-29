package edu.hrbeu.d1_abstract;

public class B extends A{

    @Override
    public Void go() {
        return null;
    }//其他类继承抽象类的时候必须重写抽象类里的方法否则该类也会变成抽象类，重写了就可以创建对象了
}
