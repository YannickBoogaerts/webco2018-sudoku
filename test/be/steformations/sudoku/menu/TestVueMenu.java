package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestVueMenu {

	VueMenu vueMenu = new VueMenu();
	Menu menu = new Menu();
	Runnable app = new Runnable() {
		
		@Override
		public void run() {
			vueMenu.affiche();
		}
	};

	@Before
	public void before() {
		vueMenu.setMenu(menu);
	}

	/**
	 * Test :"Il est possible de fixer et récupérer la valeur de la propriété
	 * menu d'une VueMenu"
	 */
	@Test
	public void testMenuProperty() {
		Assert.assertSame(menu, vueMenu.getMenu());
	}
}
