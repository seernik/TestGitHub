package com.company;

public class Aspirant extends Student {
    private String work;
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Aspirant(String firstName, String lastName, String group, double average){
        super(firstName, lastName, group, average);
        this.work=work;

    }
    public int getScolarship() {
        if (average == 5.0) {
            return 200;
        }
        return 100;
    }
    public static void main (String[] args){
        Student student=new Student("Ivanov","Ivan","12A",3.0);
        Aspirant aspirant = new Aspirant("Petrov","Petr","4354A",5.0);
        Aspirant aspirant2 = new Aspirant("pPetrov","pPetr","54A",5);
        aspirant.work="ewrwe";
        Student[] students = {student,aspirant,aspirant2};
        System.out.println(aspirant.getFirstName()+" "+aspirant.getLastName()+" "+aspirant.getGroup()+" "+aspirant.getAverage()+" "+aspirant.work);
//        System.out.println(aspirant2.getFirstName()+" "+aspirant2.getLastName()+" "+aspirant2.getGroup()+" "+aspirant2.getAverage()+" "+aspirant2.work);
    for (Student student1:students){
        System.out.println(student1.getScolarship());
           }

    }
}
