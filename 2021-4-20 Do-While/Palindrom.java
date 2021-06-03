package cetvrtiDomaci;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		/*DoWhile2: Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan broj 
		 * koji je uneo palindrom ili nije palindrom. 		  
		 * (palindromi -> isto mu dodje citali sleva nadesno ili s desne na levu stranu).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		
		int broj = sc.nextInt();
		int pocetniBroj = broj;
		int cifra = 0;
		int brojNaopako =0;
		
		if(broj >= 0) {
			while(broj >0) {
				cifra = broj % 10;
				broj = broj / 10;
				brojNaopako = brojNaopako*10 + cifra;
			}if (brojNaopako == pocetniBroj) {
				System.out.println("Uneti broj je palindrom");
				System.out.println(brojNaopako);
			}else {
				System.out.println("Uneti broj nije palindrom");
				System.out.println(brojNaopako);
			}
			
		}else {
			System.out.println("Greska! Uneti broj je negativan.");
			}
		sc.close();
	}

}
