package edu.hrbeu.d2_innerclass;

public class Outer {
    public  static String SCHOOL="HEU";
    private String name;
    public static void indoor(){
        System.out.println("aaa");
    }
    public  class Inner{
        private String name;
        private int age;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void show(){
            //内部类的方法可以访问外部类的静态方法
            Outer.indoor();
            indoor();
            //可以直接访问外部类的静态变量
            System.out.println(SCHOOL);
            //可以访问外部类的实例成员

        }
    }//属于外部类对象持有，必须存在外部类对象才会有这个成员内部类
}
