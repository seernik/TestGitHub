package com.company;

import javafx.beans.property.ObjectProperty;

public class PhoneLesson {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "lenovo";
        phone1.number = 38099999999l;
        phone1.weight = 4564.3;
        Phone phone2 = new Phone("Apple", 0667777777, 156.6);
        Phone phone3 = new Phone("HTC", 971234567);
        Phone phone4 = new Phone("Xiaomi",987654321);

        System.out.println(phone1.model + " " + phone1.number + " " + phone1.weight);
        System.out.println(phone2.model + " " + phone2.number + " " + phone2.weight);
        System.out.println(phone3.model + " " + phone3.number + " " + phone3.weight);
        System.out.println(phone4.model + " " + phone4.number + " " + phone4.weight);
        phone1.recieveCall(654989754);
        phone1.recieveCall(46587921, "dVafagf");
        phone1.sendSms("2145315","32523523","rw54","5325246");
        phone1.sendSms("rw54","5325246");
        phone1.sendSms("rw54","5325246","52462462","436367345246","4636321134","143134134","674736","764234363");
    }
}
