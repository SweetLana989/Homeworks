package treciDomaci;

import java.util.Scanner;

public class ZbirPozitivnihBrojeva {

	public static void main(String[] args) {
		/*While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
		 *  i ispisuje njihov zbir (zbir pozitivnih brojeva).
			primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/

		Scanner sc = new Scanner(System.in);
		
		int sabirak = 0; 
		int n = 0;
		int zbir = 0; 
		
		while(sabirak >= n) {
			zbir = zbir + sabirak; 
			System.out.println("Uneseite sabirak: ");
			sabirak = sc.nextInt(); 
		}
		sc.close();
		
		System.out.println("Zbir je: " + zbir);

	}

}
