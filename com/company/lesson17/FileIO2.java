package com.company.lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileIO2 {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src/io/a.txt");
             InputStream input = new FileInputStream("src/io/a.txt");) {
            char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
            // Создание текстового файла

            for (char symbol : c) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }


            int size = input.available();

            for (char symbol : c) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
