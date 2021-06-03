package raspustDomaci;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerickom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvu ocenu");
		double prva = sc.nextDouble();
		System.out.println("Unesite drugu ocenu");
		double druga = sc.nextDouble();
		System.out.println("Unesite trecu ocenu");
		double treca = sc.nextDouble();

		double prosecnaOcena;
		prosecnaOcena = ocene(prva, druga, treca);
		
		System.out.println("Prosecna ocena je " + prosecnaOcena);
		recima(prosecnaOcena);
		
		sc.close();
	}

	public static double ocene(double a, double b, double c) {
		double prosekOcena = (a + b + c) / 3;

		return prosekOcena;
	}

	public static void recima(double prosek) {
		if (prosek < 2) {
			System.out.println("nedovoljan");
		} else if (prosek < 2.5) {
			System.out.println("dovoljan");
		} else if (prosek < 3.5) {
			System.out.println("dobar");
		} else if (prosek < 4.5) {
			System.out.println("vrlodobar");
		} else {
			System.out.println("odlican");
		}
	}
}
