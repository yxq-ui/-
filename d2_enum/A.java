package edu.hrbeu.d2_enum;

public enum A {
    //枚举类第一行应该罗列名称(第一行这些都是私有的)
    X,Y,Z;
    //枚举类不能被继承
    private String name;
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
}
