package domaciTestNg;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestCalc {

	@Test
	public void testPKruga() {
		double povrsinaKruga = Calc.pKruga(3.0);
		Assert.assertEquals(povrsinaKruga, 18.84);
	}

	@Test
	public void testPKvadrata() {

		double povrsinaKvadrata = Calc.pKvadrata(3);
		Assert.assertEquals(povrsinaKvadrata, 9.0);
	}

	@Test
	public void testPPravougaonika() {
		double povrsinaPravougaonika = Calc.pPravougaonika(3.0, 4.0);
		Assert.assertEquals(povrsinaPravougaonika, 12, 0);
	}

}
