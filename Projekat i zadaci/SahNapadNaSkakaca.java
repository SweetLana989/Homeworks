package raspustDomaci;

import java.util.Scanner;

public class SahNapadNaSkakaca {

	public static void main(String[] args) {
		/*Na sahovskoj tabli je red obelezen sa 1 2 3 4 5 6 7 8 i kolona sa 1 2 3 4 5 6 7 8.
		 * Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha.
		 * Korisnik prvo unosi pozicije piona kao dva cela broja, a zatim poziciju skakaca, 
		 * gde prvi broj predstavlja red, a drugi kolonu. Program treba da ispise da li se
		 * figure nalaze u poziciji da je skakac napadnut.
		 * Primeri: 6 4 7 4 ---> nije napadnut 6 4 5 5 ---> jeste napadnut 2 2 1 1 ---> jeste
		 * napadnut 9 1 6 8 ---> greska u unosu
		 * 
		 * 2211 2213 2312 2314 2413 2415 2514 2516
		 * --> 3cifra = 1cifra-1 --> 4cifra = 2cifra +1 ili 2cifra-1
		 * pion ne moze stajati u 8. i 1. redu!
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poziciju piona, ovaj broj je red");
		int pionRed = sc.nextInt();

		System.out.println("Unesite poziciju piona, ovaj broj je kolona");
		int pionKolona = sc.nextInt();

		System.out.println("Unesite poziciju skakaca, ovaj broj je red");
		int skakacRed = sc.nextInt();

		System.out.println("Unesite poziciju skakaca, ovaj broj je kolona");
		int skakacKolona = sc.nextInt();

		boolean pogrUnos = pogresanUnos(pionRed, pionKolona, skakacRed, skakacKolona);

		boolean napadBelih = napadPiona(pionRed, pionKolona, skakacRed, skakacKolona);
		if (napadBelih == true && pogrUnos == true) {
			System.out.println("Jeste napadnut");
		} else if(napadBelih == false && pogrUnos == true) {
			System.out.println("Nije napadnut");
		} else {
			System.out.println("Pogresan unos");
		}
		sc.close();
	}

	public static boolean pogresanUnos(int a, int b, int c, int d) {
		int pozicija = ((a * 10 + b) * 10 + c) * 10 + d;

		if (a <= 1 || a >= 8 || b < 1 || b > 8 || c < 1 || c > 8 || d < 1 || d > 8) {
			return false;
		} else {
			System.out.println("Pozicija je " + pozicija);
			return true;
		}
	}

	public static boolean napadPiona(int a, int b, int c, int d) {
		boolean napad = false;

		if (c == a - 1 && (d == b - 1 || d == b + 1)) {
			napad = true;
		} else {
			napad = false;
		}
		return napad;

	}

}
