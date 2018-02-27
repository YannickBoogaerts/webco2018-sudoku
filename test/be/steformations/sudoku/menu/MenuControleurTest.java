package be.steformations.sudoku.menu;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import be.steformations.scenario.Scenario;

public class MenuControleurTest {

	private Menu menu;
	private Item item1;
	private Item item2;
	private Runnable app = new Runnable() {

		@Override
		public void run() {
			menu = new Menu();
			item1 = new Item("a", "item 1");
			menu.add(item1);
			item2 = new Item("b", "item 2");
			menu.add(item2);
			VueMenu vueMenu = new VueMenu();
			vueMenu.setMenu(menu);
			MenuControleur controleur = new MenuControleur();
			controleur.setMenu(menu);
			controleur.setVue(vueMenu);
			controleur.start();
		}
	};

	/**
	 * test : Il est possible de modifier et de récupérer le menu d'un
	 * controleur.
	 */
	@Test
	public void testMenuProperty() {
		MenuControleur controleur = new MenuControleur();
		Menu menu = new Menu();
		controleur.setMenu(menu);
		Menu menu2 = controleur.getMenu();
		assertSame(menu, menu2);
	}

	/**
	 * test : Il est possible de modifier et de récupérer la vue d'un
	 * controleur.
	 */
	@Test
	public void testVueProperty() {
		MenuControleur controleur = new MenuControleur();
		VueMenu vue = new VueMenu();
		controleur.setVue(vue);
		VueMenu vue2 = controleur.getVue();
		assertSame(vue, vue2);
	}

	/**
	 * Test Scenario 1 : l'utilisateur sélectionne un item valide à la première
	 * saisie.
	 * <ul>
	 * <li>L'ordinateur affiche :
	 * 
	 * <pre>
	 * a: item 1
	 * b: item 2
	 * Entrer un choix ('<'pour annuler ) :
	 * </pre>
	 * 
	 * </li>
	 * <li>l'utilisateur entre "a"</li>
	 * <li>fin du scénario</li>
	 * </ul>
	 * A la fin du scénario l'item sélectionnée dans le menu est 'item 1
	 */
	@Test
	public void testScenario1() {
		Scenario scenario = new Scenario(app);
		StringBuilder ecran0 = new StringBuilder();
		ecran0.append("a : item 1").append(System.lineSeparator());
		ecran0.append("b : item 2").append(System.lineSeparator());
		ecran0.append("Entrer un choix ('<'pour annuler ) :");

		scenario.setInput(Arrays.asList(new String[] { "a" }));
		scenario.testAffichago(0, ecran0.toString());

		assertSame(item1, menu.getSelected());
	}

	/**
	 * Test Scenario 2 : l'utilisateur annule l'opération à la première saisie.
	 * <ul>
	 * <li>L'ordinateur affiche :
	 * 
	 * <pre>
	 * a: item 1
	 * b: item 2
	 * Entrer un choix ('<'pour annuler ) :
	 * </pre>
	 * 
	 * </li>
	 * <li>l'utilisateur entre "<"</li>
	 * <li>fin du scénario</li>
	 * </ul>
	 * A la fin du scénario l'item sélectionnée dans le menu est null
	 */
	@Test
	public void testScenario2() {
		Scenario scenario = new Scenario(app);
		StringBuilder ecran0 = new StringBuilder();
		ecran0.append("a : item 1").append(System.lineSeparator());
		ecran0.append("b : item 2").append(System.lineSeparator());
		ecran0.append("Entrer un choix ('<'pour annuler ) :");

		scenario.setInput(Arrays.asList(new String[] { "<" }));
		scenario.testAffichago(0, ecran0.toString());

		assertNull(menu.getSelected());
	}
	
	/**
	 * Test Scenario 3 : l'utilisateur entre deux valeurs non valides avant une entrée valide.
	 * <ul>
	 * <li>L'ordinateur affiche :
	 * 
	 * <pre>
	 * a: item 1
	 * b: item 2
	 * Entrer un choix ('<'pour annuler ) :
	 * </pre>
	 * 
	 * </li>
	 * <li>l'utilisateur entre "z"</li>
	 * <li>L'ordinateur affiche :
	 * 
	 * <pre>
	 * a: item 1
	 * b: item 2
	 * 'z' n'est pas un choix correct
	 * Entrer un choix ('<'pour annuler ) :
	 * </pre>
	 * 
	 * </li>
	 * <li>l'utilisateur entre ""</li>
	 * <li>L'ordinateur affiche :
	 * 
	 * <pre>
	 * a: item 1
	 * b: item 2
	 * '' n'est pas un choix correct
	 * Entrer un choix ('<'pour annuler ) :
	 * </pre>
	 * 
	 * </li>
	 * <li>l'utilisateur entre "b"</li>
	 * <li>fin du scénario</li>
	 * </ul>
	 * A la fin du scénario l'item sélectionnée dans le menu est item 2
	 */
	@Test
	public void testScenario3_0() {
		Scenario scenario = new Scenario(app);
		StringBuilder ecran0 = new StringBuilder();
		ecran0.append("a : item 1").append(System.lineSeparator());
		ecran0.append("b : item 2").append(System.lineSeparator());
		ecran0.append("Entrer un choix ('<'pour annuler ) :");
		
		scenario.setInput(Arrays.asList(new String[] { "z","","b" }));
		scenario.testAffichago(0, ecran0.toString());
	}
}
