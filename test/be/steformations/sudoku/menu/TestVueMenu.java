package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import be.steformations.scenario.Scenario;

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

	/**
	 * test : "affiche() affiche l'état du menu"
	 */
	@Test
	public void testAffichage() {
		menu.add(new Item("a", "toto"));
		menu.add(new Item("b", "dédé"));
		menu.add(new Item("q", "quitter"));
		StringBuilder builder = new StringBuilder();
		builder.append("a : toto").append(System.lineSeparator());
		builder.append("b : dédé").append(System.lineSeparator());
		builder.append("q : quitter").append(System.lineSeparator());
		new Scenario(app).testAffichago(0, builder.toString());
		
	}

}
