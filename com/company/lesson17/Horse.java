package com.company.lesson17;

import java.io.Serializable;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    private Halter halter;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(halter, horse.halter);
    }

    @Override
    public int hashCode() {

        return Objects.hash(halter);
    }

    public Horse(Halter halter) {

        this.halter = halter;
    }
}