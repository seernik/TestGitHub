package com.company.lesson16;

import java.util.Objects;

public class Toy {
    private String name;
    private Double cost;

    public Toy(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Toy() {
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name) &&
                Objects.equals(cost, toy.cost);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
