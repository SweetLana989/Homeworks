package test;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Drugi zadatak Napisati program koji racuna razliku izmedju visine najviseg i
		 * najnizeg igraca kosarkaskog tima kao i prosecnu visinu igraca. Korisnik na
		 * standardni ulaz unosi visinu svih pet igraca kosarkskog tima. Visina je
		 * izrazena u metrima. Po zavrsetku unosa ispisuje se prosecna visina clana
		 * ekipe, visina najviseg igraca, visina najnizeg igraca i razlika u visini ta
		 * dva igraca. Ukoliko korisnik unese nevalidnu vrednost kao visinu ispisati
		 * poruku o gresci i omoguciti mu da ponovi unos. Smatrati da ne postoji
		 * kosarkas visi od 2,5 metara. Zadatke pisati u dve odvojene klase nazvane
		 * Zadatak1 i Zadatak2. Izrada testa traje 90 minuta. Paket u kome se pisu klase
		 * nazvati test. Folder na drajvu nazvati test1.
		 */
		Scanner sc = new Scanner(System.in);
		double najnizi = 3;
		double unos;
		double najvisi = 0;
		double razlika = 0;
		double ukupnaVisina = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Unesite visinu " + i + " igraca");
			unos = sc.nextDouble();
			while (unos <= 0 || unos > 2.5) {
				System.out.println("Molimo unesite validnu visinu");
				unos = sc.nextDouble();
			}
			if (unos > najvisi) {
				najvisi = unos;
			}
			if (unos < najnizi) {
				najnizi = unos;
			}
			ukupnaVisina = ukupnaVisina + unos;

		}
		System.out.println("Prosecna visina clana ekipe je " + ukupnaVisina / 5);
		System.out.println("Najvisi clan ekipe je visok " + najvisi + " metara");
		System.out.println("Najnizi clan ekipe je visok " + najnizi + " metara");
		razlika = najvisi = najnizi;
		System.out.println("Razlika izmedju najviseg i najnizeg clana ekipe je " + razlika + " metara");
		sc.close();
	}

}
