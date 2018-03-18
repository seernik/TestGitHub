package com.company.lesson22;

import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<Integer> supplier =() -> (int) (Math.random()*10);
        System.out.println(supplier.get());
    }
}
