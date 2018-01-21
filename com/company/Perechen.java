package com.company;

public class Perechen {
    public static void main(String[] args) {
        Seasons mySeasons = Seasons.AUTUMM;
        System.out.println(mySeasons);
        printSeason(mySeasons);
    }
    public static void printSeason(Seasons seasons){
       switch (seasons){
           case WINTER:
               System.out.println("I Hate Winter. Temperature " + seasons.getTemp());
           break;
           case AUTUMM:
               System.out.println("I Hate Autumm. Temperature " + seasons.getTemp());
           break;
           case SUMMER:
               System.out.println("I Hate Summer. Temperature " + seasons.getTemp());
           break;
           case SPRING:
               System.out.println("I Hate Spring. Temperature " + seasons.getTemp());
           break;
           default:
               System.out.println("I Hate every time of year. Temperature " + seasons.getTemp());
       }
       printAllSeasons();
    }

    private static void printSeason() {
    }

    public static void printAllSeasons(){
        Seasons[] seas = Seasons.values();
        for (Seasons seasons: seas){
            System.out.println(seasons);
            System.out.println(seasons + " place " + seasons.ordinal() + " temp - " + seasons.getTemp());
            System.out.println(seasons.getDescription());
        }
    }
}
