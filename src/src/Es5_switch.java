package src;
import java.util.Scanner;

public class Es5_switch {
	/*
	 * 
	 * Scrivere un programma che chiede in ingresso il giorno e
il mese e stampa il numero dei giorni che sono trascorsi
dall'inizio dell'anno fino alla data inserita. 
Il programma
deve verificare la validità della data inserita, stampando
nel caso un messaggio d'errore.
L’anno va considerato non bisestile (febbraio ha 28
giorni)  */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int giorno, mese, giorni_tot = 0;

		// Input del giorno e del mese
		System.out.println("Inserisci il giorno: ");
		giorno =  in.nextInt();
		System.out.println("Inserisci il mese: ");
		mese =  in.nextInt();

		// Controllo del mese
		if(mese < 1 || mese > 12) {
			System.out.println("Mese errato.");
			in.close();  	// chiudo la Scanner 
			return; 		// termino esecuzione del programma
		}

		else {
			switch(mese) {
			case 2:
				if(giorno < 1 || giorno > 28) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
				break;
			case 11, 4, 6, 9:
				if(giorno < 1 || giorno > 30) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
			break;
			default:
				if(giorno < 1 || giorno > 31) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
			}
		}

		// ipotizzo che siano corretti mese e giorno
		switch(mese) {
			case 12:
				giorni_tot = 30 * 4 + 31 * 6 + 28 + giorno; 
				break;
			case 11:
				giorni_tot = 30 * 4 + 31 * 5 + 28 + giorno;  
				break;
			case 10:
				giorni_tot = 30 * 4 + 31 * 4 + 28 + giorno; 
				break;
			case 9:
				giorni_tot = 30 * 3 + 31 * 4 + 28 + giorno;
				break;
			case 8:
				giorni_tot = 30 * 3 + 31 * 3 + 28 + giorno; 
				break;
			case 7:
				giorni_tot = 30 * 2 + 31 * 3 + 28 + giorno;	
				break;
			case 6:
				giorni_tot = 30 * 1 + 31 * 3 + 28 + giorno; 
				break;
			case 5:
				giorni_tot = 30 * 1 + 31 * 2 + 28 + giorno;	
				break;
			case 4:
				giorni_tot = 31 * 2 + 28 + giorno;	
				break;
			case 3:
				giorni_tot =  31 + 28 + giorno;	
				break;
			case 2:
				giorni_tot =  31 + giorno; 	
				break;
			case 1:
				giorni_tot = giorno; 
				break;
		}

		System.out.println("Sono passati " + giorni_tot + " da inizio dell'anno");

		in.close();
	}
}
