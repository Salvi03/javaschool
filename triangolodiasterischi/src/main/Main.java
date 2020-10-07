package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Inserisci il numero di righe: ");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);

        int i = Integer.parseInt(keyboard.readLine());
        int j, k;

        for (j = 0; j < i; j++) {
            for (k = 0; k <= j; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
