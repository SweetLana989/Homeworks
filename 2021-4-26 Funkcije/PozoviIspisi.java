package sedmiDomaci;

import java.util.Scanner;

public class PozoviIspisi {

	public static void najmanjiBroj(int a, int b, int c) {
		int najmanji = a;
		if (b < najmanji) {
			najmanji = b;
		}
		if (c < najmanji) {
			najmanji = c;
		}

		System.out.println("Najmanji od tri uneta broja je " + najmanji);
	}

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci
		 * da korisnik unosi tri broja) i taj program treba da pozove i ispise u mainu)
		 * najmanji od ta tri unesena broja.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi broj");
		int prvi = sc.nextInt();
		System.out.println("Unesi broj");
		int drugi = sc.nextInt();
		System.out.println("Unesi broj");
		int treci = sc.nextInt();

		najmanjiBroj(prvi, drugi, treci);

		sc.close();
	}

}
