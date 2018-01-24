package com.company.lesson10;

public class Skirt extends Clothes implements FemaleClothes {
    public static void main(String[] args) {

    }

    public Skirt(int price, String color, ClothesSize x) {
        super(price, color, x);
    }

    @Override
    public void dressingFemale() {
        System.out.println("Dressing skirt");
    }

}