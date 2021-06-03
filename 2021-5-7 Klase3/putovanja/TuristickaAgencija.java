package putovanja;

import java.util.ArrayList;
import java.util.List;

public class TuristickaAgencija {

	public static void main(String[] args) {
		/* U glavnom programu se igrati i testirati napisane klase. Obavezni deo: napraviti bar 3 razlicita
		 * putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. Jednom
		 * putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
		 * Sa putovanja izbaciti jednog od putnika. Neobavezni: vas slobodan izbor u
		 * skladu sa tekstom zadatka
		 */
		
		Putnici t1 = new Putnici("Zika", "Pavlovic", 123456);
		Putnici t2 = new Putnici("Prijatelj", "Milan", 234567);
		Putnici t3 = new Putnici("Prija", "Jelena", 345678);
		Putnici t4 = new Putnici("Darinka", "Pavlovic", 654321);
		
		List<Putnici> listaDinastija = new ArrayList<Putnici>();
		listaDinastija.add(t1);
		listaDinastija.add(t2);
		listaDinastija.add(t3);
		listaDinastija.add(t4);
		
		List<Putnici> listaPrijatelji = new ArrayList<Putnici>();
		listaPrijatelji.add(t1);
		listaPrijatelji.add(t2);
		
		Putovanja p1 = new Putovanja("Zanzibar", 120000, listaPrijatelji);
		Putovanja p2 = new Putovanja("Bali", 100000, listaDinastija);
		Putovanja p3 = new Putovanja("Indonezija", 145000, listaDinastija);
		Putovanja p4 = new Putovanja("Peru", 150000, null);
		
		List<Putovanja> ponuda = new ArrayList<Putovanja>();
		ponuda.add(p1);
		ponuda.add(p2);
		ponuda.add(p3);
		ponuda.add(p4);
		
	
		
		System.out.println("Ponuda egzoticnih putvanja za maj je ");
		for(int i = 0; i < ponuda.size(); i++){
			System.out.println( ponuda.get(i).getDestinacija());
		}
		
		ponuda.remove(3);
		System.out.println("Ponuda egzoticnih putvanja za maj nakon otkazivanja je ");
		for(int i = 0; i < ponuda.size(); i++){
			System.out.println( ponuda.get(i).getDestinacija());
		}
		ponuda.get(0).setCenuAranzmana(90000);
		System.out.println("Nakon last minut ponude za destinaciju " + ponuda.get(0).getDestinacija() +" cena je " + ponuda.get(0).getCenaAranzmana());
		
		System.out.println("Zbog nepaznje prilikom pranja prozora putovanje je otkazano za putnika " + ponuda.get(1).getListaPutnika().get(3).getImePutnika() + " " + ponuda.get(1).getListaPutnika().get(3).getPrezimePutnika());

		listaDinastija.remove(3);
		
		for(int i = 0; i< listaDinastija.size(); i++) {
			System.out.println(listaDinastija.get(i).getImePutnika() + " " + listaDinastija.get(i).getPrezimePutnika());
		}

	}

}
