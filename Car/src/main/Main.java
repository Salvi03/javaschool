package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);

        System.out.print("Inserisci quanti litri di benzina mettere: ");
        int litri = Integer.parseInt(keyboard.readLine());

        System.out.print("Inserisci il numero di chilometri che può fare la macchina con un litro: ");
        int km = Integer.parseInt(keyboard.readLine());

        int result = litri*km;
        System.out.println("Puoi percorrere " + result + " chilometri");
    }
}
