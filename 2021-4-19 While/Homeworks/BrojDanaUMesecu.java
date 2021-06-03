package drugiDomaci;

import java.util.Scanner;

public class BrojDanaUMesecu {

	public static void main(String[] args) {
		/*Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
		 *  (Vodite racuna o prestupnoj godini!)*/ 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite mesec:");
		String imeMeseca = sc.nextLine();
		
		System.out.println("Unesite godinu:");
		int godina = sc.nextInt();
		
		
		switch (imeMeseca){
		case "Januar":
		case "Mart":
		case "Maj":
		case "Jul":
		case "Avgust":
		case "Oktobar":
		case "Decembar":
			System.out.println("Uneti mesec ima 31 dan.");
			break;
		case "April":
		case "Jun":
		case "Septembar":
		case "Novembar":
			System.out.println("Uneti mesec ima 30 dana.");
			break;
		case "Februar": 
			if(godina % 4 == 0) {
			System.out.println("Uneti mesec ima 29 dana.");
			break;
			}else {
			System.out.println("Uneti mesec ima 28 dana.");
			break;
			} 
		default:
			System.out.println("Neispravan unos");
				
			}
		sc.close();
		}	
	}
		
		
	


