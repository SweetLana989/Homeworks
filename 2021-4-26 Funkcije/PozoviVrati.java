package sedmiDomaci;

import java.util.Scanner;

public class PozoviVrati {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj");
		int a = sc.nextInt();
		System.out.println("Unesite broj");
		int b = sc.nextInt();
		System.out.println("Unesite broj");
		int v = sc.nextInt();
		
		System.out.println("Proizvod brojeva je " + vratiProizvod(a, b, v));
		sc.close();
		

	}
	
	public static int vratiProizvod(int a, int b, int c) {
		return a*b*c;
	}

}
