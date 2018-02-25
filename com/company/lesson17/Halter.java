package com.company.lesson17;

import java.io.Serializable;
import java.util.Objects;

public class Halter implements Serializable{
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Halter)) return false;
        Halter halter = (Halter) o;
        return Objects.equals(color, halter.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }
}
