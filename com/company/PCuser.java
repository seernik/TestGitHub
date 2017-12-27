package com.company;

public class PCuser {
    public static void main(String[] args) {
        int r = (int) (Math.random()*2);
        PC pc1 = new PC();
        pc1.cpu = "i5";
        pc1.typeRam = "DDR4";
        pc1.ram = 8;
        pc1.hdd = 1.84;
        PC pc2 = new PC();
        pc2.cpu = "A10";
        pc2.typeRam = "DDR4";
        pc2.ram = 8;
        pc2.hdd = 512;
        pc2.showInfo();
        System.out.println(pc1.checkRam());

    }

}
