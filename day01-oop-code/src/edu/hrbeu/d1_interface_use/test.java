package edu.hrbeu.d1_interface_use;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //班级学生管理系统
        //1，创建学生类
        //2.定义接口：ClassDate

        //3.定义两套类分别处理，以便解耦合
        ArrayList<Student> students=new ArrayList<>();
      students.add(new Student("张三",'女',80));
        students.add(new Student("李四",'女',95));
        students.add(new Student("王五",'女',75));
        students.add(new Student("赵六",'女',100));
        students.add(new Student("傻逼",'男',90));
        students.add(new Student("冈峦",'男',100));
        students.add(new Student("二比",'男',80));

        ClassDate data = new ClassDateilmpl2(students);//多态，切换就是改1为2
        data.printAllStudentAverageScore();
        data.printAllStudentInfos();
    }
}
