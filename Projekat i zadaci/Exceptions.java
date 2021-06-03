package bugReport;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		/*
		 * Dodatni zadatak, naravno neobavezan: pronaci metode u javi koje ce spreciti
		 * korisnike da unose nezeljene tipove podataka (ako zelimo int, da se odbranimo
		 * u unosenja charova, stringova itd)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Uneseite broj");

		try {
			int broj = sc.nextInt();
			System.out.println(broj);
		} catch (Exception e) {
			System.out.println("Greska, unos mora biti numericki");
		}

		sc.close();
	}

}
