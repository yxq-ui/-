package hrbeu.edu.d1_static_fierld;

public class test {
    public static void main(String[] args) {
         student.name="001";


        student s1=new student();
        s1.name="002";

        student s2=new student();
        s2.name="003";

        System.out.println(student.name);
        System.out.println(s1.name);//输出结果003
    }
}
