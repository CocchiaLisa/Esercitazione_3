package src;
import java.util.Scanner;
public class Es1_switch {
	/*
	 * Date le misure dei lati di un rettangolo lato1 e lato2, 
	 * fornite da tastiera, scrivi un programma che calcoli il 
	 * perimetro, l'area o la diagonale secondo la richiesta 
	 * dell'utente [1_perimetro, 2_area, 3_diagonale]
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lato1, lato2, perimetro, area, diagonale, scelta;
		
		 // Richiesta dell'input dei lati del rettangolo
		System.out.println("Inserisci il primo lato: ");
		lato1 = in.nextInt();
		System.out.println("Inserisci il secondo lato: ");
		lato2 = in.nextInt();
		
		// Stampo un menù per la scelta dell'operazione desiderata
		System.out.println("Inserisci: ");
		System.out.println("1_ perimetro ");
		System.out.println("2_ area ");
		System.out.println("3_ diagonale ");
		scelta = in.nextInt();	// Leggo la scelta dell'utente	
		
		// Switch per determinare l'operazione in base alla scelta dell'utente
		switch(scelta) {
		case 1:
			perimetro = lato1 * 2 + lato2 * 2;
			System.out.println("Il perimetro è: " + perimetro);
			break;
		case 2:
			area = lato1 * lato2;
			System.out.println("L'area è: " + area);
			break;
		case 3: 
			diagonale = (int) Math.sqrt((lato1 * lato1) + (lato2 * lato2));
			System.out.println("La diagonale è: " + diagonale);
			break;
			
			default:
				System.out.println("Scelta errata");
		}
		
		in.close();
	}

}
