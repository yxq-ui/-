package edu.hrbeu.d_extends;



public class test {
    public static void main(String[] args) {
        B b=new B();//此时b里面包含了A B 的所有变量但是访问的权限不一样
        System.out.println(b.i);//i公开的可以访问，jk都是私有的得看权限


    }
}


