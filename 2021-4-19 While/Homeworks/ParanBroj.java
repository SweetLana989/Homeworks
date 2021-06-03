package drugiDomaci;

import java.util.Scanner;

public class ParanBroj {

	public static void main(String[] args) {
			
		/*Grananja1: Napisati program koji proverava da li je uneti broj paran. Ukoliko jeste, program treba da ispise poruku:
		 *  Broj je paran! Ukoliko nije, program treba da ispise poruku: Broj je neparan!*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj ");
		int broj = sc.nextInt();
		
		if(broj % 2 == 0) {
			System.out.println("Broj je paran!");			
		}else {
			System.out.println("Broj je neparan!");
		}
		
		sc.close();
	}

}
