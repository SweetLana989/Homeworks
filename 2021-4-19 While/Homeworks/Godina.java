package drugiDomaci;

import java.util.Scanner;

public class Godina {

	public static void main(String[] args) {
		/* Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini 
		 * koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch
*/ 
		//januar 2jun 3jul
		//februar
		//mart 2maj 
		//avgust 2april
		//septembar
		//oktobar
		//novembar
		//decembar
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime meseca ");
		String imeMeseca = sc.nextLine();
		
		switch(imeMeseca) {
		
		case "Januar":
		case "januar":
		case "Jun":
		case "jun":
		case "Jul":
		case "jul":
			System.out.println("U godini na slovo 'J' ima tri meseca.");
			break;
		case "Februar":
		case "februar":
			System.out.println("U godini na slovo 'F' ima jedan mesec.");
			break;
		case "Mart":
		case "mart":
		case "Maj":
		case "maj":
			System.out.println("U godini na slovo 'M' ima dva meseca.");
			break;
		case "Avgust":
		case "avgust":
		case "April":
		case "april":
			System.out.println("U godini na slovo 'A' ima dva meseca.");
			break;
		case "Septembar":
		case "septembar":
			System.out.println("U godini na slovo 'S' ima jedan mesec");
			break;
		case "Oktobar":
		case "oktobar":
			System.out.println("U godini na slovo 'O' ima jedan mesec");
			break;
		case "Novembar":
		case "novembar":
			System.out.println("U godini na slovo 'N' ima jedan mesec");
			break;
		case "Decembar":
		case "decembar":
			System.out.println("U godini na slovo 'D' ima jedan mesec");
			break;
		default:
			System.out.println("Neispravan unos.");
		
		}
		
		sc.close();
				
	}

}
