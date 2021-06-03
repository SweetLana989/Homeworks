package raspustDomaci;

import java.util.Scanner;

public class BrCifara {

	public static void main(String[] args) {
		// Napisati program koji ispisuje koliko cifara ima uneti broj n.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int n = sc.nextInt();
		
		int brojCifara = brCifara(n);
		System.out.println("Duzina broja koji te uneli je: " + brojCifara);
		sc.close();
	}
	
	public static int brCifara(int broj) {
		int brojac=0;
		while (broj !=0){
			broj=broj/10;
			brojac++;
		}
		
		return brojac;
	}

		
		
	
}
