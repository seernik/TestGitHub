package com.company.lesson10;

public class Shirt extends Clothes implements MaleClothes,FemaleClothes {
    public static void main(String[] args) {

    }

    public Shirt(int price, String color, ClothesSize x) {
        super(price, color, x);
    }

    public Shirt() {

    }

    @Override
    public void dressingFemale() {
        System.out.println("Dressing shirt");
    }

    @Override
    public void dressingMale() {
        System.out.println("Dressing shirt");
    }
}
