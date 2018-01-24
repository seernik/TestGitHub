package com.company.lesson10;

import java.util.Objects;

public abstract class Clothes {
    public int price;
    public String color;
    public ClothesSize x;

    public Clothes(){};

    public Clothes(int price, String color, ClothesSize x) {
        this.price = price;
        this.color = color;
        this.x = x;
    }

    public Clothes(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public ClothesSize getX() {
        return x;
    }

    public void setX(ClothesSize x) {
        this.x = x;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "Clothes{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", x=" + x +
                '}';
    }

}
