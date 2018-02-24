package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	/**
	 * Test la définition d'un Item.
	 * <ul>
	 * <li>Un Item est définit par : une clé : String et un libellé :
	 * String.</li>
	 * <li>Un Item est instancié en lui donnant sa clé et son libellé.</li>
	 * <li>getKey() retourne la clé de l'Item.</li>
	 * <li>getLibel() retourne le libellé de l'Item.</li>
	 * </ul>
	 */
	@Test
	public void testConstructeur1() {
		Item item = new Item("a", "libellé 1");
		String key = item.getKey();
		Assert.assertEquals("a", key);
		String libel = item.getLibel();
		Assert.assertEquals("libellé 1", libel);
	}

	@Test
	public void testConstructeur2() {
		Item item = new Item("b", "libellé 2");
		String key = item.getKey();
		Assert.assertEquals("b", key);
		String libel = item.getLibel();
		Assert.assertEquals("libellé 2", libel);
	}
}
