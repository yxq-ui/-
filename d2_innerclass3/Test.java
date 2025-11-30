package edu.hrbeu.d2_innerclass3;

import java.security.CryptoPrimitive;

public class Test {
    public static void main(String[] args) {
        //匿名内部类本质是一个子类，同时也会生成一个子类对象
        //匿名内部类的名称，当前类名&编号
        Animal a=new Animal() {
          @Override
          public void cry() {
              System.out.println("汪汪汪");
          }

        };
        a.cry();

        }

    }




abstract class Animal {
    public abstract void cry();
}