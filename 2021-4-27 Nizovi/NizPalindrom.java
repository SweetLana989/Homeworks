package osmiDomaci;

import java.util.Scanner;

public class NizPalindrom {

	public static void main(String[] args) {
		/* Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji
		 * su tipa int. Zatim niz proslediti metodi koja treba da proveri da li je niz
		 * palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu
		 * razumljivim tekstom da li je unesen niz palindrom.
		 * Primer ucitanog niza koji je palindrom: 12 46 17 46 12
		 * Primer ucitanog niza koji nije palindrom: 12 46 17 12 64 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza.");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza.");
			niz[i] = sc.nextInt();
		}
		
		if (palindrom(niz) == true) {
			System.out.println("Uneti niz je palindrom");

		} else {
			System.out.println("Uneti niz nije palindrom");
		}
		sc.close();
	}

	public static boolean palindrom(int[] a) {

		boolean palindrom = false;
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]==a[a.length - i - 1]) {
				palindrom = true;
			}else {
				palindrom = false;
				break;
			}
		}
		return palindrom;
		
	}

}
