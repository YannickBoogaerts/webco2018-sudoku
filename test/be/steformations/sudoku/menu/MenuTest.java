package be.steformations.sudoku.menu;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {

	private Menu menu;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;

	@Before
	public void before() {
		menu = new Menu();
		item1 = new Item("a", "lib 1");
		menu.add(item1);
		item2 = new Item("c", "lib 2");
		menu.add(item2);
		item3 = new Item("z", "lib 3");
		menu.add(item3);
		item4 = new Item("b", "lib 4");
		menu.add(item4);
	}

	/**
	 * Test que les items d'un menu sont récupérables via leur clé.
	 */
	@Test
	public void testGetItem() {
		Assert.assertSame(item1, menu.getItem("a"));
		Assert.assertSame(item4, menu.getItem("b"));
		Assert.assertSame(item3, menu.getItem("z"));
		Assert.assertSame(item2, menu.getItem("c"));
	}

	/**
	 * Test que les items d'un menu sont récupérables dans l'ordre d'insertion.
	 */
	@Test
	public void testOrder(){
		Collection<Item> allItem = menu.getAllItem();
		Iterator<Item> iterator = allItem.iterator();
		Assert.assertSame(item1, iterator.next());
		Assert.assertSame(item2, iterator.next());
		Assert.assertSame(item3, iterator.next());
		Assert.assertSame(item4, iterator.next());
	}
}
