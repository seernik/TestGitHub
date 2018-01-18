package com.company;

import java.util.Objects;

public abstract class Shape {
    public int x ,y;
    public String color;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Shape(String color){
        this.color=color;
    }
//    public Shape(int[] x){
//      this.x = x[];
//    }
    public Shape(String color, int x, int y){
    this.color=color;
    this.x=x;
    this.y=y;
}
    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
