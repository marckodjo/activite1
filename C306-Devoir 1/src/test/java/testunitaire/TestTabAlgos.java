package testunitaire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
class TestTabAlgos {

@Test
public void testPlusGrand() {
final int t = 30;
final int[] tableauEntier = {0, 5, 8, 12, 2, 30};
assertEquals(t, TabAlgos.plusGrand(tableauEntier));
}
@Test
public void testCalculMoyenne() {
final int[]  tableauEntier = {10, 5, 5, 5};
final double t = 6.0;
try {
assertEquals(t, TabAlgos.moyenne(tableauEntier));
} catch (Exception e) {
//TODO
}
}
@Test
public void testEgaux() {
final int[] tableauEntier1 = {0, 5, 8, 12, 2, 30};
final int[] tableauEntier2 = {0, 5, 8, 12, 2, 30};
assertTrue(TabAlgos.egaux(tableauEntier1, tableauEntier2));
}
@Test
public void testSimilaire() {
final int[] tableauEntier1 = {0, 5, 8, 12, 2, 30};
final int[] tableauEntier2 = {12, 5, 30, 0, 2, 8};
assertTrue(TabAlgos.similaires(tableauEntier1, tableauEntier2));
}
}

