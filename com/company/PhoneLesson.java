package com.company;

import javafx.beans.property.ObjectProperty;

public class PhoneLesson {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setNumber(38099999999l);
        phone1.setWeight(4564.3);
        phone1.setModel("Lenovo");
        Phone phone2 = new Phone("Apple", 0667777777, 156.6);
        Phone phone3 = new Phone("HTC", 971234567);
        Phone phone4 = new Phone("Xiaomi",987654321);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());
        System.out.println(phone4.getModel() + " " + phone4.getNumber() + " " + phone4.getWeight());
        System.out.println(Phone.getCountInstance());
        phone1.recieveCall(654989754);
        phone1.recieveCall(46587921, "dVafagf");
        phone1.sendSms("2145315","32523523","rw54","5325246");
        phone1.sendSms("rw54","5325246");
        phone1.sendSms("rw54","5325246","52462462","436367345246","4636321134","143134134","674736","764234363");
    }
}
