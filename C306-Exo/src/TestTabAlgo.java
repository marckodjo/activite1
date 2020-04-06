import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTabAlgo {

	@Test
	public void testPlusGrand() {
		int tableauEntier[] = {0,5,8,12,2,30};
		assertEquals(30, TabAlgos.plusGrand(tableauEntier));
	}
	
	@Test
	public void testCalculMoyenne() {
		int tableauEntier[] = {0,5,8};
		try {
			assertEquals(4.33,TabAlgos.moyenne(tableauEntier));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testEgaux() {
		int tableauEntier1[] = {0,5,8,12,2,30};
		int tableauEntier2[] = {0,5,8,12,2,30};
		assertEquals(true,TabAlgos.egaux(tableauEntier1, tableauEntier2));

	}
	
	@Test
	public void testSimilaire() {
		int tableauEntier1[] = {0,5,8,12,2,30};
		int tableauEntier2[] = {12,5,30,0,2,8};
		assertEquals(true,TabAlgos.similaires(tableauEntier1, tableauEntier2));
	}

}
