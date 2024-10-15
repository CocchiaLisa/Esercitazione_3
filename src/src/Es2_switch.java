package src;
import java.util.Scanner;
/*
 * 	Esercizio 2- lettera del nome
	Creare un programma che ricevuto un carattere dice se è una 
	delle lettere che compongono il tuo nome.
*/
public class Es2_switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char lettera;
		
		System.out.println("Inserisci lettera: ");
		lettera = in.next().charAt(0);
		
		// Switch per verificare se la lettera inserita appartiene al nome "Lisa"
		switch(lettera) {
		case 'l':
		case 'i':
		case 's':
		case 'a':
			System.out.println("Appartiene");
			break;
		default:
			// Se la lettera non è tra quelle specificate, stampa "Non appartiene".
			System.out.println("Non appartiene");
			break;
		}
		in.close();

	}

}
