package raspustDomaci;

import java.util.Scanner;

public class IspravkaGresakaUKodu {

	public static void main(String[] args) {
		// Ovaj kod predstavlja kalkulator povrsina
		// kvadrata, pravougaonika i kruga.
		// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		// Ukoliko se unese 'izadji', program treba da se zavrsi.
		// Program treba da se ponavlja dokle god se ne unese izadji.

		Scanner sc = new Scanner(System.in);
		boolean izlaz = false;

		String figura;
		while (!izlaz) {
			System.out.println("Unesite figuru za koju zelite da izracunate povrsinu");
			figura = sc.nextLine();
			figura = figura.toLowerCase();

			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				izlaz = true;
				System.out.println("Kraj programa");
				sc.close();
				break;
			default: 
				System.out.println("Mozete da izaberete samo krug, kvadrat, pravougaonik ili izadji");
				break;
			}
		}
	}

	public static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poluprecnik kruga");
		double r;
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je: " + pKruga(r));
	}

	public static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu pravougaonika");
		double a, b;
		a = sc.nextDouble();
		System.out.println("Unesite sirinu pravougaonika");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		} else {
			System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));
		}

	}

	public static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata");
		double a;
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));
	}

	public static double pKruga(double r) {
		return r * r * 3.14;
	}

	public static double pKvadrata(double a) {
		return a * a;
	}

	public static double pPravougaonika(double a, double b) {
		return a * b;
	}
	
	
}
