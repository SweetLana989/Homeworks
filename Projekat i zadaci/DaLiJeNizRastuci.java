package raspustDomaci;

import java.util.Scanner;

public class DaLiJeNizRastuci {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite" + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();
		}
		ispis(niz);
		System.out.println();
		boolean rastuci = daLiJeRastuci(niz);
		if(rastuci == true) {
			System.out.println("Niz je rastuci");
		}else {
			System.out.println("Niz nije rastuci");
		}
	
		sc.close();
	}

	public static void ispis(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static boolean daLiJeRastuci(int[] nizic) {
		boolean rastuci = false;
		for (int i = 0; i < nizic.length - 1 ; i++) {
			if (nizic[i] <= nizic[i + 1]) {
				rastuci = true;
			} else {
				rastuci = false;
				break;
			}
		}
		return rastuci;
	}
}
