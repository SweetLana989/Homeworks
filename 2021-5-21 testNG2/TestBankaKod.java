package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {
	
	@Test
	public void testKonstruktor() {
		
		String ime = "Svetlana";
		String ziroRacun = "012-34567-89";
		Double iznos = 0d;
		BankaKod bk = new BankaKod(ime, ziroRacun);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), ime);
		sa.assertEquals(bk.dohvatiZiroRacun(), ziroRacun);
		sa.assertEquals(bk.dohvatiIznos(), iznos);
		
		sa.assertAll();
	}
	
}
