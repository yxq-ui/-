package edu.hrbeu.d1_this;

public class Student {
   private String name;
   private  int age;
   private String schoolname;

    public Student() {
    }

    public Student(String name, int age) {
        this(name,age,"heu");//使用this()
    }

    public Student(String name, int age, String schoolname) {
        this.name = name;
        this.age = age;
        this.schoolname = schoolname;
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

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
}
