package raspustDomaci;

import java.util.Scanner;

public class ZbirNBrKojiNIsuDeljiviBrK {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci
		 * one koji su deljivi brojem k.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int n = sc.nextInt();
		System.out.println("Unesite broj kojim zelite da brojevi ne budu deljivi");
		int k = sc.nextInt();
		
		int zbir = zbirBrojeva(n, k);
		System.out.println("Zbir brojeva koji nisu deljivi brojem " + k + " je " + zbir);
		
		sc.close();
	}
	
	public static int zbirBrojeva(int a, int b) {
		int zbir = 0;
		for(int i = 1; i<=a; i++) {
			if(i%b == 0) {
				continue;
			}else {
				zbir = zbir+i;
			}
		}
		return zbir;

	}

}
