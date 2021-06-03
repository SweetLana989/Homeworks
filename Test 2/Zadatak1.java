package test2;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Prvi zadatak Napisati program na programskom jeziku Java koji sluzi za
		 * pronalazenje niza sa vecim prosecnim elementom. Korisnik na standardniu ulaz
		 * unosi duzniu prvog niza, a zatim i sve njegove elemente. Nakon toga unosi
		 * duzinu drugog niza i sve njegove elemente. Ukoliko korisnik unese nevalidnu
		 * vrednost za duzinu niza ispisati poruku o tome i prekinuti izvrsavanje
		 * programa. Pretpostaviti da ce korisnik uneti cele brojeve za elemente niza.
		 * Ucitavanje niza izvrsiti u zasebnoj funkciji. Napisati funkciju pronadji
		 * kojoj se proslednjuju oba niza. Funkcija pronadji racuna prosecnu vrednost
		 * elementa za oba niza i kao rezultat vreca vecu od te dve prosecne vrednosti.
		 * Na stendardni izlaz ispisati rezultat funkcije.
		 */

		Scanner sc = new Scanner(System.in);
		int[] niz1;
		int[] niz2;
		System.out.println("Unesite duzinu prvog niza.");
		int duzina1 = sc. nextInt();
		if(duzina1 <= 0) {
			System.out.println("Nevalidna vrednost za duzinu niza");
			return;
		}else {
			 niz1 = new int[duzina1];
			ucitajNiz(niz1);
		}
		
		
		
		System.out.println("Unesite duzinu drugog niza.");
		int duzina2 = sc.nextInt();		
		if(duzina2 <= 0) {
			System.out.println("Nevalidna vrednost za duzinu niza");
			return;
		}else {
			niz2 = new int[duzina2];
			ucitajNiz(niz2);
		}
		
		int veciProsek = pronadji(niz1, niz2);
		System.out.println("Rezultat niza sa vecim prosekom je " + veciProsek);
	}
	
	public static void ucitajNiz(int[] niz) {
		Scanner sb = new Scanner(System.in);
		for(int i =0; i<niz.length; i++) {
			System.out.println("Unesite " + (i+1) + ". element niza.");
			niz[i] = sb.nextInt();
			
		}
		
	}
	public static int pronadji(int[] niz1, int[] niz2) {
		int zbir1 = 0;
		int zbir2 = 0;
		int prosek1;
		int prosek2;
		for(int i = 0; i<niz1.length; i++) {
			zbir1 = zbir1 + niz1[i];
		}
		for(int j =0; j<niz2.length; j++) {
			zbir2 = zbir2 + niz2[j];
		}
		prosek1 = zbir1 / niz1.length;
		prosek2 = zbir2/ niz2.length;
		
		if(prosek1>prosek2) {
			return prosek1;
		}else{
			return prosek2;
		}
	}
}
