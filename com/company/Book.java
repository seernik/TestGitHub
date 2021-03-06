package com.company;

public class Book implements Printable {
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Book(){};
   public Book(String name){
       this.name=name;
   }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Printing "+ name);

    }

    public static void main(String[] args) {
        Book book1 = new Book("Google");
        book1.print();

    }
    public static void printBooks(Printable[] printables) {
        for (Printable mg : printables) {
            if (mg instanceof Book) {
                System.out.println(mg);
            }
        }
    }
}
