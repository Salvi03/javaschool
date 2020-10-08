package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = new Scanner(System.in).nextLine();
        File file = new File(filename);

        if (file.createNewFile()) {
            System.out.println("Il file " + filename + " è stato creato");
        } else {
            System.out.println("Il file " + filename + " non è stato creato");

            System.out.print("Vuoi leggere il contenuto del file? ");
            String response = new Scanner(System.in).nextLine();

            if (response.equals("y")) {
                Scanner reader = new Scanner(file);

                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            } else {
                System.out.print("Vuoi scrivere il contenuto del file? ");
                response = new Scanner(System.in).nextLine();

                if (response.equals("y")) {
                    FileWriter writer = new FileWriter(filename);
                    String text =
                }
            }
        }
    }
}
