package cetvrtiDomaci;

import java.util.Scanner;

public class PeraPokloni {

	public static void main(String[] args) {
		/* Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze.
		 * On moze da kupuje sve dok mu ne ostane samo 89 dinara 
		 * jer mu toliko novca treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim poklonima. 
		 * Pera treba  da unosi pojedinacne cene poklona,
		 * a program treba da ga obavesti kada potrosi sav predvidjeni novac,
		 * to jest kada za sledeci poklon vise nema kinte.
		 * program ispise koliko je poklona Pera uspeo da kupi.
		 */	
		Scanner sc = new Scanner(System.in);
		
		double novac; 
		double cenaPoklona=0; 
		int busPlus = 89;
		int brojPoklona = 0;
	
		System.out.println("Sa koliko novca raspolazes?");
		novac = sc.nextDouble(); 
	
		do {
			System.out.println("Trenutni novac kojim raspolazes je " + novac);  
			if(novac >= busPlus) {
				System.out.println("Koliko kosta poklon?");	
				cenaPoklona = sc.nextDouble(); 	 				
			}
			if(novac >= cenaPoklona+busPlus) {
				novac = novac - cenaPoklona;
				brojPoklona++;					
			}else {
				System.out.println("Nemas dovoljno novca za busplus");
				System.out.println("Broj kupljenih poklona je " + brojPoklona);
				sc.close();
				break;
			}
		}while(novac >= busPlus);	
	}
}


