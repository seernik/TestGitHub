package com.company.Lesson11;


public class WrapDemo {
    public static void main(String[] args) {
//        int i = 5446;
        Double doub1;
        doub1 = new Double("42.2552");
        Double doub2 = 423.4235;
        Double doub3 = (double) 342525;
        Double doub4 = (double) 435;
        Double doub5 = Double.valueOf("3242.4253");
        System.out.println(doub1+"\n"+doub2+"\n"+doub3+"\n"+doub4+"\n"+doub5);
        Double doub6 = Double.parseDouble("4234.36465");
        System.out.println(doub6);
        System.out.println(Double.toString(doub6));
        String str = Double.toString(doub6);
        System.out.println(str);
        System.out.println(doub1.byteValue());
        System.out.println(doub1.shortValue());
        System.out.println(doub1.intValue());
        System.out.println(doub1.longValue());
        System.out.println(doub1.floatValue());
        System.out.println(doub1.doubleValue());
        System.out.println(doub1.toString());

    }
}
