package edu.hrbeu.d1_interface_use;

import java.util.ArrayList;

public class ClassDateilmpl2 implements ClassDate{
    private ArrayList<Student> students;

    public ClassDateilmpl2(ArrayList<Student> students) {
        this.students=students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("======展示全部学生信息=======");
        int count=0;
        for (int i = 0; i < students.size(); i++) {
         Student s=students.get(i);
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
         if (s.getSex()=='男'){
             count ++;
         }

        }
        System.out.println("男生人数为："+count+",女生人数为："+(students.size()-count));
    }

    @Override
    public void printAllStudentAverageScore() {
        System.out.println("========展示学生平均分======");
        Student s1=students.get(0);
        double score=s1.getScore();
        double allscore=score;
        double max=score;
        double min=score;
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            double sc=s.getScore();
            allscore+=s.getScore();
            if(sc>max) max=sc;
            if(sc<min) min=sc;
        }
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分"+(allscore-max-min)/(students.size()-2));






    }
}//第二套代码
