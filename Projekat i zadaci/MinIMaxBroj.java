package raspustDomaci;

import java.util.Scanner;

public class MinIMaxBroj {
	/* Napisati program gde korisnik unosi n brojeva i ispisuje max i min broj. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko brojeva cete uneti");
		int duzina = sc.nextInt();		
		int[] niz = new int[duzina];

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ".broj");
			niz[i] = sc.nextInt();
		}
		System.out.println("Njamanji broj od unetih je " + minBroj(niz) + ", a najveci je " + maxBroj(niz));
	sc.close();	
	}

	public static int maxBroj(int[] a) {
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int minBroj(int[] b) {
		int min = 9;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < min) {
				min = b[i];
			}
		}
		return min;

	}

}
