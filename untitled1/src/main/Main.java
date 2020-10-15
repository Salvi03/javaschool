package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

    	InputStreamReader input = new InputStreamReader(System.in);
    	BufferedReader keyboard = new BufferedReader(input);

	    int[][] matrix = new int[3][3];

	    int n_rows = matrix.length;
	    int n_columns = matrix[0].length;

	    int i,j, total = 0;
	    for (i=0; i<n_rows; i++) {
	    	for (j=0; j<n_columns; j++) {
	    		System.out.print("Inserisci un numero: ");
	    		matrix[i][j] = Integer.parseInt(keyboard.readLine());
	    		total += matrix[i][j];
	    	}
		}

	    System.out.println("La somma dei numeri nella matrice è " + total);
    }
}
