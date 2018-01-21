package com.company;

public enum Seasons {
    WINTER(-16.1),SPRING(7.8),SUMMER(23.6){
        public String getDescription(){
            return "Hot and Warm time";
        }
    }
    ,AUTUMM(3.6);
    double temp;

    Seasons(double temp) {
        this.temp = temp;
    }
    Seasons(){
        this.temp = -273;
    }

    public double getTemp() {
        return temp;
    }
    public String getDescription(){
        return "Cold time";
    }
}
