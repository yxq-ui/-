package edu.hrbeu.d1_abstract_use2;

public abstract class People {
    public final void write(){
        System.out.println("标题");
        System.out.println("第一段");
        //
        writeMain();
        System.out.println("结尾");

    }//模板方法用final修饰防止被重写
    public abstract void writeMain();
}

