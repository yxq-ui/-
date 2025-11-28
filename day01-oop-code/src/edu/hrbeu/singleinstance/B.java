package edu.hrbeu.singleinstance;



public class B {
    private static B b; //懒汉单例，一开始不创建对象




    private B(){}

    public  static B getInstance(){
        if(b==null){
            b=new B();
        }
        return b;
    }
}
