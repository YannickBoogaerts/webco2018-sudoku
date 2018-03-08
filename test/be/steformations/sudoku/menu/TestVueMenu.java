package be.steformations.sudoku.menu;

import java.util.Arrays;
import java.util.Scanner;

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
			vueMenu = new VueMenu();
			 vueMenu.setMenu(menu);
			vueMenu.afficher();
			new Scanner(System.in).nextLine();
			vueMenu.saisir("un message", "le prompt :");
			vueMenu.saisir(null, "le prompt2 :");
		}
	};
	private Scenario scenario;

	@Before
	public void before() {
		vueMenu.setMenu(menu);
		scenario = new Scenario(app);
		scenario.setInput(Arrays.asList("1","2","3"));
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
		scenario.testAffichago(0, builder.toString());
		
	}

	/**
	 * test si la saisie avec un message "un message" et un prompt "le prompt :" affiche 
	 * <pre>
	 * un message
	 * le prompt :
	 * </pre>
	 * et fait une saisie sur System.in
	 */
	@Test
	public void testSaisieAvecMessage() {
		menu.add(new Item("a", "toto"));
		menu.add(new Item("b", "dédé"));
		menu.add(new Item("q", "quitter"));
		StringBuilder builder = new StringBuilder();
		builder.append("un message").append(System.lineSeparator());
		builder.append("le prompt :");
		scenario.testAffichago(1, builder.toString());
		
	}
	
	/**
	 * test si la saisie avec un message null et un prompt "le prompt2 :" affiche 
	 * <pre>
	 * le prompt2 :
	 * </pre>
	 * et fait une saisie sur System.in
	 */

	@Test
	public void testSaisieSansMessage() {
		menu.add(new Item("a", "toto"));
		menu.add(new Item("b", "dédé"));
		menu.add(new Item("q", "quitter"));
		StringBuilder builder = new StringBuilder();
		builder.append("le prompt2 :");
		scenario.testAffichago(2, builder.toString());
		
	}
	
}
