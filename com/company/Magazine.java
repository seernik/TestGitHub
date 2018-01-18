package com.company;

public class Magazine implements Printable{
    String name, color;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Magazine(){};
    public Magazine(String name, String color){
        this.name=name;
        this.color=color;
    }



}
