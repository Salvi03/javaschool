package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);

        int[] array;
        array = new int[10];

        int i;

        for (i=0; i<array.length; i++) {
            System.out.print("Inderisci un numero: ");
            array[i] = Integer.parseInt(keyboard.readLine());
        }

        System.out.print("Inserisci un numero da trovare: ");
        int to_find = Integer.parseInt(keyboard.readLine()), counter = 0, sommapari = 0, sommadispari = 0;

        for (i=0; i<array.length; i++) {
            if (array[i] % 2 == 0)
                sommapari += array[i];
            else
                sommadispari += array[i];

            if (array[i] == to_find)
                counter++;
        }

        System.out.println("Il totale dei numeri è " + (sommadispari + sommapari));
        System.out.println("La media dei numeri nell'array è di " + ((float)(sommapari + sommadispari)/array.length));
        System.out.println("Il numero " + to_find + " è stato trovato " + counter + " volte");
    }
}
