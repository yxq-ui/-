package edu.hrbeu.d2_innerclass3;

public class Test2 {
    public static void main(String[] args) {
        Swimming s1=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳很快");

            }
        };
        go(s1);
    }
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");


    }
}
interface Swimming{
    void swim();
}
