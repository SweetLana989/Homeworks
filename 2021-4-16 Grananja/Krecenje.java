package drugiDomaci;

import java.util.Scanner;

public class Krecenje {

	public static void main(String[] args) {
		
		
		/*Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, 
		 * koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
		 *  (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
		 *  
		 * Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, 
		 * tako sto se ivice prostorije ucitavaju preko konzole. 
		 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika
			i da nema prozora i vrata).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite visinu prostorije ");
		double h = sc.nextDouble();
		
		System.out.println("Unesite duzinu prostorije ");
		double a = sc.nextDouble();
	
		System.out.println("Unesite sirinu prostorije ");
		double b = sc.nextDouble();
		
		if(h>0 && a>0 && b>0) {
			System.out.println("Povrsina prostorije za krecenje je " + (a*b + 2*(a*h) + 2*(b*h)));
			
		} else {
			System.out.println("Uneti podaci nisu validni");
		}
		
		sc.close();
	}

}
