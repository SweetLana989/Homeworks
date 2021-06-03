package sedmiDomaci;

import java.util.Scanner;

public class PozoviIspisiVrati {

	public static void main(String[] args) {
		/*
		 * spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program
		 * koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve
		 * metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih
		 * brojeva.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj");
		int prvi = sc.nextInt();

		System.out.println("Unesite drugi broj");
		int drugi = sc.nextInt();

		System.out.println("Unesite treci broj");
		int treci = sc.nextInt();

		ispisiZbir(prvi, drugi, treci);
		int najveciUnetibroj = najveciBroj(prvi, drugi, treci);
		System.out.println("Najveci broj je " + najveciUnetibroj);
		
		sc.close();
	}

	public static void ispisiZbir(int a, int b, int c) {
		System.out.println("Zbir unetih brojeva je " + (a + b + c));
	}

	public static int najveciBroj(int a, int b, int c) {
		int najveci = a;
		if (b > najveci) {
			najveci = b;
		}
		if (c > najveci) {
			najveci = c;
		}
		return najveci;
	}

}
