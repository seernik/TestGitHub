package com.company;

public class Student {
    String firstName, lastName, group;
    double average;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student(String firstName, String lastName, String group, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.average = average;
    }

    public int getScolarship() {
        if (average == 5.0) {
            return 100;
        }
        return 80;
    }

}


