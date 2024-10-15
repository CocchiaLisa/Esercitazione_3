package src;
import java.util.Scanner;
/*
 * 	Create un programma, che chiesto il giorno in numero 
 * restituisca il corrispondente in lettere. 
*/
public class Es3_switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int giorno;
		
		System.out.println("Inserisci il giorno in numero: ");
		giorno = in.nextInt();
		
		switch(giorno) {
		case 1: 
			System.out.println("Lunedì");
			break;
		case 2: 
			System.out.println("Martedì");
			break;
		case 3: 
			System.out.println("Mercoledì");
			break;
		case 4: 
			System.out.println("Giovedì");
			break;
		case 5: 
			System.out.println("Venerdì");
			break;
		case 6: 
			System.out.println("Sabato");
			break;
		case 7: 
			System.out.println("Domenica");
			break;	
		default:
			System.out.println("Giorno non esistente");
			break;
		}
		
		
		in.close();
	}

}
