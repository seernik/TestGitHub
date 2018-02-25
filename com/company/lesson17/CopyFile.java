package com.company.lesson17;


import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\io\\testtext.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\io\\copytexttest.txt"))) {
                 String str;
            while((str =reader.readLine())!=null)
                 {
                     writer.write(str);
                     writer.newLine();
                 }
             } catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
