package edu.hrbeu.d1_extends_override2;

public class test {
    public static void main(String[] args) {
        //目的是搞清楚方法重写在实际开放中的应用场景
        student s=new student("小张",'女',169.5,"执着");
        System.out.println(s);//打印对象地址值（默认调用父类object的tostring）不能打具体内容不好所以我们要重写tostring方法

    }
}
