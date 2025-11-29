package edu.hrbeu.d1_abstract_use;

public abstract class Animal {
    private String name;

    public abstract void action();
    public String getName(){return name;}

    public void setName(String name){
        this.name=name;
    }

}
