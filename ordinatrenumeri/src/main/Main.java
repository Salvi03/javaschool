package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int a,b,c;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);

        System.out.print("Inserisci un numero: ");
        a = Integer.parseInt(keyboard.readLine());

        System.out.print("Inserisci un numero: ");
        b = Integer.parseInt(keyboard.readLine());

        System.out.print("Inserisci un numero: ");
        c = Integer.parseInt(keyboard.readLine());

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < c && b < a) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (b < a) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }
    }
}
