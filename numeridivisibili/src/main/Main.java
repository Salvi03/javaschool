package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        
        System.out.print("Inserisci un numero: ");
        int a = Integer.parseInt(keyboard.readLine());

        System.out.print("Inserisci un numero: ");
        int b = Integer.parseInt(keyboard.readLine());
        
        if (a%b != 0) {
            System.out.println(a + " non è divisibile per " + b);
        } else {
            System.out.println(a + " è divisibile per " + b);
        }

        if (b%a != 0) {
            System.out.println(b + " non è divisibile per " + a);
        } else {
            System.out.println(b + " è divisibile per " + a);
        }
    }
}
