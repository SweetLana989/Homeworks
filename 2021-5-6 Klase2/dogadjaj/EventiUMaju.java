package dogadjaj;

public class EventiUMaju {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		Dvorana d1 = new Dvorana("Sajam", "Beograd", 200000);
		Dvorana d2 = new Dvorana("Sonata Open Concept", "Beograda", 350);
		Dvorana d3 = new Dvorana("Camp nou", "Barselona", 99354);

		Event e1 = new Event("7.maj 08:00h", d1, "vakcinacija");
		Event e2 = new Event("10.maj 22:00h", d1, "izlozba knjiga");
		Event e3 = new Event("23.maj 13:00h", d2, "vencanje");
		Event e4 = new Event("25.maj 18:00h", d3, "derbi");
		
		sb.append("Event ");
		sb.append("koji ce ");
		sb.append("biti ");
		sb.append("odrzan ");
		sb.append("u maju ");
		sb.append("je: ");
		
		sb.insert(14, "sigurno ");
		
		System.out.println(sb.toString()+ e1.getTipEventa() + " na "+ e1.getDvorana().getNazivDvorane() + "u.");
		
		sb.replace(11, 14, "nece ");
		sb.delete(15, 23);
		System.out.println(sb.toString() + e4.getTipEventa() + " na " + e4.getDvorana().getNazivDvorane()
				+ " u " + e4.getDvorana().getGrad());
		
		e2.setVremen("11. maj 13:00h");
			
		sb1.append("je ");
		sb1.append("odlozena ");		
		sb1.insert(0, " ");
		
		System.out.println(e2.getTipEventa() + " na " + e2.getDvorana().getNazivDvorane() + "u " + sb1.toString() + " za " + e2.getVreme() );
		
		sb2.append("Usled ");
		sb2.append("korone ");
		sb2.append("smanjen je ");
		sb2.append("broj mesta ");
		sb2.append("na ");
		
		System.out.println(sb2.toString() + e3.getTipEventa() + " sa " + e3.getDvorana().getBrMesta() + " na " + e3.getDvorana().redukovanBrojMesta() + " zvanica");
		
	}

}
