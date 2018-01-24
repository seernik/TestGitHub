package com.company.lesson10;

public class Pants extends Clothes implements MaleClothes, FemaleClothes {
    public static void main(String[] args) {

    }

    public Pants(int price, String color, ClothesSize x) {
        super(price, color, x);
    }

    @Override
    public void dressingFemale() {
        System.out.println("Dressing pants");
    }

    @Override
    public void dressingMale() {
        System.out.println("Dressing pants");
    }
}
