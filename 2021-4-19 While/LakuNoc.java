package treciDomaci;

import java.util.Scanner;

public class LakuNoc {

	public static void main(String[] args) {
		/*While2: Napisati program koji ce na standardnom izlazu ispisati poruku 
		 * “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
		 * ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");

		int broj = sc.nextInt();
		String poruka = "Laku noc!";
		int iterator = 1;
		
		while(iterator <= broj) {
			System.out.println(poruka);
			iterator++;
		}
		sc.close();
		
	}	
}
