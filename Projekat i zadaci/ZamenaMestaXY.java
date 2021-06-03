package raspustDomaci;

public class ZamenaMestaXY {

	public static void main(String[] args) {
		/*
		 * Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako
		 * da im se vrednosti zamene. Dostaviti oba resenja, sa i bez uvodjenja novih
		 * promenljivih
		 */

		int x = 3;
		int y = 7;
		int pom=0;
		System.out.println("Brojevi pre zamene su " + x + " " + y);
	
		pom=x;
		x=y;
		y=pom;
		System.out.println("Brojevi psole zamene su " + x + " " + y);
						
		
	}

}
