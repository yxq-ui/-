package edu.hrbeu.d_extends_modifier;

public class Fu {
    private void privateMethod(){
        System.out.println("private");
    }

     void Method(){
        System.out.println("缺省");
    }

    protected void protectedMethod(){
        System.out.println("protect");
    }
   public void publicMethod(){
        System.out.println("public");
    }


    public static void main(String[] args) {
        Fu f=new Fu();
        f.privateMethod();
        f.publicMethod();
        f.protectedMethod();
        f.Method();//同一个类中都可以调用
    }
}
