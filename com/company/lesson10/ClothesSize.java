package com.company.lesson10;

public enum ClothesSize {
    XXS(32) {
        public String getDescription() {
            return "Child size";
        }
    }, XS(34), S(36), M(38), L(40);
    int euroSize;

    ClothesSize(int euSize) {
        this.euroSize = euSize;
    }

    ClothesSize() {
        this.euroSize = 2;
    }

    public double getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}