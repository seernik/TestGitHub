package com.company.lesson10;

public class Tie extends Clothes implements MaleClothes {
    public static void main(String[] args) {
    }

    public Tie(int price, String color, ClothesSize x) {
        super(price, color, x);
    }

    @Override
    public void dressingMale() {
        System.out.println("Dressing tie");
    }
}