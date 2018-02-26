package be.steformations.sudoku.menu;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuControleurTest {

	/**
	 * test : Il est possible de modifier et de récupérer le menu d'un controleur.
	 */
	@Test
	public void testMenuProperty() {
		MenuControleur controleur = new  MenuControleur();
		Menu menu = new Menu();
		controleur.setMenu(menu);
		Menu menu2 = controleur.getMenu();
		assertSame(menu, menu2);
	}
	
	/**
	 * test : Il est possible de modifier et de récupérer la vue d'un controleur.
	 */
	@Test
	public void testVueProperty() {
		MenuControleur controleur = new  MenuControleur();
		VueMenu vue = new VueMenu();
		controleur.setVue(vue);
		VueMenu vue2 = controleur.getVue();
		assertSame(vue, vue2);
	}

}
