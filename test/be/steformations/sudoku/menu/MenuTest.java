package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Regroupe les tests sur les spécifications de la classe Menu.
 * 
 * @author yannick
 *
 */
public class MenuTest {

	private Menu menu;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;

	/**
	 * Instancie le Menu et les 4 items et ajoute ceux-ci au menu.
	 * <ul>
	 * <li>a lib1</li>
	 * <li>c lib2</li>
	 * <li>z lib3</li>
	 * <li>b lib4</li>
	 * </ul>
	 */
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
	 * Test l'ajout d'un Item.
	 */
	@Test
	public void testAddItem() {
		Item item = new Item("d", "libel 5");
		menu.add(item);
		Assert.assertSame(item, menu.getItem("d"));
		Assert.assertSame(item1, menu.getItem("a"));
		Assert.assertSame(item4, menu.getItem("b"));
		Assert.assertSame(item3, menu.getItem("z"));
		Assert.assertSame(item2, menu.getItem("c"));
	}

	/**
	 * Test le remplacement d'un Item.
	 */
	@Test
	public void testReplaceItem() {
		Item item = new Item("a", "libel 5");
		menu.add(item);
		Assert.assertSame(item, menu.getItem("a"));
		Assert.assertSame(item4, menu.getItem("b"));
		Assert.assertSame(item3, menu.getItem("z"));
		Assert.assertSame(item2, menu.getItem("c"));
	}

	/**
	 * Test getItem() avec return null.
	 */
	@Test
	public void tesGetItemReturnNull() {
		Assert.assertNull(menu.getItem("d"));
	}

	/**
	 * Test la valeur par défaut de l'item sectionné.
	 */
	@Test
	public void testSelectedDefaultValue() {
		Assert.assertNull(menu.getSelected());
	}

	/**
	 * Test la valeur de l'item sectionné après un sélection valide.
	 */
	@Test
	public void testSelectedAferSelect_OK() {
		menu.select("a");
		Assert.assertSame(item1, menu.getSelected());
	}

	/**
	 * Test la valeur de l'item sectionné après un sélection non valide.
	 */
	@Test
	public void testSelectedAferSelect_KO() {
		menu.select("s");
		Assert.assertNull(menu.getSelected());
		menu.select("a");
		menu.select("s");
		Assert.assertSame(item1, menu.getSelected());
	}

	/**
	 * Test la valeur de l'item sectionné après init().
	 */
	@Test
	public void testSelectedAferInit() {
		menu.select("a");
		menu.init();
		Assert.assertNull(menu.getSelected());
	}

}
