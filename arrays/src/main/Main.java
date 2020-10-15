package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);

        int i;

        int[] array, arraycres; //, arraydec;

        array = new int[5];
        arraycres = new int[5];
//        arraydec = new int[5];

        for (i=0; i<array.length; i++) {
            System.out.print("Inserisci un numero: ");
            array[i] = Integer.parseInt(keyboard.readLine());
        }

        int k, indice=0;

        for (i=0; i<array.length; i++) {
            // System.out.println(min);
            int min = array[i];
            System.out.println(min);
            for (k=0; k<array.length; k++) {
                if (array[k] < min && k > i) {
                    min = array[k];
                }
            }

            indice++;
            arraycres[i] = min;
            System.out.println(arraycres[i]);
        }
    }
}
