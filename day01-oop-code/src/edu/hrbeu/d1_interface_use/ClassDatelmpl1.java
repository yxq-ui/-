package edu.hrbeu.d1_interface_use;

import java.util.ArrayList;

public class ClassDatelmpl1 implements ClassDate {
    private ArrayList<Student> students;
    public ClassDatelmpl1(ArrayList<Student> students) {
        this.students=students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("======展示全部学生信息");
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }
    }

    @Override
    public void printAllStudentAverageScore() {
        double allscore=0;
        System.out.println("=====展示全部学生的平均分====");
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            allscore+=s.getScore();


        }
        System.out.println("平均分为："+allscore/students.size());


    }
}//第一套代码
