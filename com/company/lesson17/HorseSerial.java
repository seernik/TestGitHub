package com.company.lesson17;

import java.io.*;

public class HorseSerial {
    public static final String FILE_NAME = "horse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse(new Halter());
        serializable(horse);
        Horse deserHorse = deserializable();
        System.out.println(horse.equals(deserHorse));
    }

    public static void serializable(Horse horse) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(horse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserializable() {
        Horse horse = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(FILE_NAME))) {
            horse = (Horse) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return horse;

    }
}
