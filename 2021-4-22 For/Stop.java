package petiDomaci;

import java.util.Scanner;

public class Stop {

	public static void main(String[] args) {
		//Napisati program koji omoguciti korisniku da unosi recii,
		//sve dok ne unese rec “stop”, nebitno da li je koristio mala, 
		//velika slova ili kombinaciju. 
		//Mozete pri radu koristiti petlju po izboru.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec");
		
		String rec = sc.nextLine();	
		String stop = "Stop";
		
		while(!rec.equalsIgnoreCase(stop)) {
			System.out.println("Unesite rec");
			rec=sc.nextLine();	
		}
		System.out.println("Ne mozete vise unositi reci!");
		
		sc.close();
	}

}
