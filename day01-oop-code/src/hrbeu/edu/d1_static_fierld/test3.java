package hrbeu.edu.d1_static_fierld;

public class test3 {
    public static void main(String[] args) {
        //了解静态方法和实例方法的用法
        //类名访问静方法
        cat.printHelloWorld();
        //对象名.静态方法(可以用不推荐)
        cat c1=new cat();
        c1.printHelloWorld();
        //实例方法是闭合的不可以拿类来访问只能用对象来访问
        c1.score=100;
        c1.printPass();
    }
}
