package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Test Java Prvi zadatak Napisati program na programskom jeziku Java koji sluzi
		 * kao kviz za pogadjanje zemalja iz kojih dolaze teniseri. Korisnik moze da
		 * odgovara sve dok ne izabere opciju za izlaz. Korisniku se na standardni izlaz
		 * ispisuje sledecui meni: 1. Djokovic 2. Nadal 3. Federer 4. Izlaz
		 * 
		 * Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. Nakon
		 * toga mu se ispisuje poruka sa pitanjem. Npr. ukoliko je korisnik izablao
		 * opciju jedan ispisuje se poruka: "Iz koje zemlje dolazi Djokovic?". Ukoliko
		 * korisnik unese tacan odgovor ispisuje se poruka "Tacno!". Ukoliko korisnik
		 * unese netacan odgovor ispisuje se poruka "Netacno!". Nakon toga opet se
		 * ispisuje isti meni sa istim funkcionalnostima. Ukoliko korisnik izabere
		 * opciju 4 izlazi se iz programa. Ukoliko korisnik unese neki nevalidan broj
		 * kao opciju ponovo ispisati meni. Prilikom provere tacnosti odgovora ne treba
		 * voditi racuna o velikim i malim slovima. Tacni odgovori su: Djokovic -
		 * Srbija, Nadal - Spanija, Federer - Svajcarska.
		 */
		Scanner sc = new Scanner(System.in);

		int unos = 0;
		String odgovor1 = "SRBIJA";
		String odgovor2 = "SPANIJA";
		String odgovor3 = "SVAJCARSKA";
		String odgovor= "";
		//String odgovorVelika;

		do {
			System.out.println("Izaberite neku od opcija");
			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");

			unos = sc.nextInt();

			switch (unos) {
			case 1:
				System.out.println("Iz koje zemlje dolazi Djokovic?");

				odgovor = sc.next();
				odgovor = odgovor.toUpperCase();
				
				if (odgovor.equals(odgovor1)) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Netacan odgovor");
				}

				break;
			case 2:
				System.out.println("Iz koje zemlje dolazi Nadal?");
				odgovor = sc.next();
				odgovor = odgovor.toUpperCase();
				if (odgovor.equals(odgovor2)) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Netacan odgovor");
				}

				break;
			case 3:
				System.out.println("Iz koje zemlje dolazi Federer?");
				odgovor = sc.next();
				odgovor = odgovor.toUpperCase();
				if (odgovor.equals(odgovor3)) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Netacan odgovor");
				}
				break;
			case 4:
				System.out.println("Kraj programa");
				break;
			default:
				System.out.println("Izaberite neke od ponudjenih opcija!");
				break;
			}
		} while (unos != 4);

		sc.close();
	}

}
