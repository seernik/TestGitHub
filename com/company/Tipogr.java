package com.company;

public class Tipogr {
    public static void main(String[] args) {
        Book book2 = new Book("book2");
        Magazine mag = new Magazine("mag", "red");
        Book book3 = new Book("book3");
        Magazine mag2 = new Magazine("mag2", "blue");
        Book book4 = new Book("book4");
        Magazine mag3 = new Magazine("mag3", "green");
        Book book5 = new Book("book5");
        Magazine mag4 = new Magazine("mag4", "black");
        System.out.println(book2.toString());
        System.out.println(mag.toString());
        Printable[] papers = {book2, mag, book3, mag2, book4, book5, mag4, mag3};
        Book.printBooks(papers);
        Magazine.printMags(papers);
    }
}