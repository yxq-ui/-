package edu.hrbeu.d_extends_modifier;




public class demo1 {
    public static void main(String[] args) {
        Fu f=new Fu();
        f.Method();//同一个包下
        f.protectedMethod();//子孙类或者同一个包下可以
        f.publicMethod();//同一个包下除了私有的还可以用
    }

}
