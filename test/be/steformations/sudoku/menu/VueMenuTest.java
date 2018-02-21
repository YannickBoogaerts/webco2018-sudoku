package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VueMenuTest {


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
	 * Une VueMenu peut recevoir la référence d'un Menu.
	 */
	@Test
	public void testSetMenu(){
		VueMenu vue = new VueMenu();
		vue.setMenu(menu);
		Menu menu2 = vue.getMenu();
		Assert.assertSame(menu, menu2);
	}
}
