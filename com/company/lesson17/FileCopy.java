package com.company.lesson17;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;
        File file = new File("src\io\file.txt");
        File file2 = new File("src\io\filecopy.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file);) {
            size = fr.read(in);
            for (int i = 0; i< size; i++){
            fw.write(in[i]);
            fw.flush();

             // read the whole file!
            // how many bytes read
            System.out.println("Количество прочитанных символов: "
                    + size + " ");
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
