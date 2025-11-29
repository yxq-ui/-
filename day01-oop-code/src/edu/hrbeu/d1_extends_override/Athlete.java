package edu.hrbeu.d1_extends_override;

public class Athlete extends People {
    @Override//加上这个可以检查方法重写是否正确增加可读性
    public /*方法重写是访问权限必须大于等于父类该方法的权限*/void/*返回值类型比父类小或者相等*/ run(){//方法重写，和父类一模一样
        System.out.println("运动员跑到贼快");
    }//私有方法不能重写 静态方法也是不能被重写
}
