package osmiDomaci;

import java.util.Scanner;

public class ProizvodElemenataNiza {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 84 */
				 // index 0 1 2 3 4 5 --> 3*7*4=84

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();
		int niz[] = new int[duzina];

		unesiNiz(niz);
		int proizvod = proizvodElementa(niz);
		System.out.println("Proizvod elemenata koji su veci od svog indexa je " + proizvod);
		sc.close();
	}
	public static void unesiNiz(int[] niz) {
		Scanner sb = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sb.nextInt();
		}
		sb.close();
	}
	public static int proizvodElementa(int[] nizElementa) {
		int proizvod = 1;
		for (int i = 0; i < nizElementa.length; i++) {
			if (nizElementa[i] > i) {
				proizvod = proizvod * nizElementa[i];
			}
		}
		return proizvod;
	}
}
