package be.steformations.sudoku.sudkuEtoile;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;

import be.steformations.util.AbstractScenarioTest;

/**
 * VueEtoile.afficheGrilleVide() affiche une grille vide d'un sudoku Etoile.
 * 
 * <pre>
"                      SUDOKU ETOILE                      "
"                      =============                      "
"+-------+-------+-------+       +-------+-------+-------+"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"+-------+-------+-------+       +-------+-------+-------+"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"+-------+-------+-------+-------+-------+-------+-------+"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"+-------+-------+-------+-------+-------+-------+-------+"
"                | . . . | . . . | . . . |                "
"                | . . . | . . . | . . . |                "
"                | . . . | . . . | . . . |                "
"+-------+-------+-------+-------+-------+-------+-------+"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"| . . . | . . . | . . . | . . . | . . . | . . . | . . . |"
"+-------+-------+-------+-------+-------+-------+-------+"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"+-------+-------+-------+       +-------+-------+-------+"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"| . . . | . . . | . . . |       | . . . | . . . | . . . |"
"+-------+-------+-------+-------+-------+-------+-------+"
 * </pre>
 */
public class VueEtoileTest extends AbstractScenarioTest {

	@Override
	public List<String> getInput() {
		return Collections.emptyList();
	}

	@Override
	public void test(String out) {
		Scanner scanner = new Scanner(out);
		Assert.assertEquals("                      SUDOKU ETOILE                      ", scanner.nextLine()); 
		Assert.assertEquals("                      =============                      ", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+       +-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+       +-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+-------+-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+-------+-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("                | . . . | . . . | . . . |                ", scanner.nextLine()); 
		Assert.assertEquals("                | . . . | . . . | . . . |                ", scanner.nextLine()); 
		Assert.assertEquals("                | . . . | . . . | . . . |                ", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+-------+-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+-------+-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+       +-------+-------+-------+", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("| . . . | . . . | . . . |       | . . . | . . . | . . . |", scanner.nextLine()); 
		Assert.assertEquals("+-------+-------+-------+-------+-------+-------+-------+", scanner.nextLine()); 
	}                                       
                                            
	@Override                               
	public void run() {                     
		new VueEtoile().afficheGrilleVide();
	}                                       
                                            
	@Override                               
	public int getStep() {
		return 0;
	}

}
