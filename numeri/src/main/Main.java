package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    String num;
    	int n;
    	int max = -1;

	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader keyboard = new BufferedReader(input);

		System.out.print("Inserisci un numero ");
	    num = keyboard.readLine();
	    n = Integer.parseInt(num);

		if (n > 0) {
			max = n;
		}

	    while (n != 0) {
	    	System.out.print("Inserisci un numero ");
			num = keyboard.readLine();
			n = Integer.parseInt(num);

			if (n > 0 && n > max) {
				max = n;
				System.out.println("Il numero è maggiore degli altri numeri");
			}
		}
    }
}
