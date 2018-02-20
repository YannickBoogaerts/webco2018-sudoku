package be.steformations.sudoku.sudoku4x4;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import be.steformations.util.Scenario;
import be.steformations.util.TestScenario;

public class Vue4x4Test {

	/**
	 * Vue4x4.afficheGrilleVide() affiche une grille vide d'un sudoku 4x4.
	 * 
	 * <pre>
	" SUDOKU 4 x 4"
	" ============"
	"+-----+-----+"
	"| . . | . . |"
	"| . . | . . |"
	"+-----+-----+"
	"| . . | . . |"
	"| . . | . . |"
	"+-----+-----+"
	 * </pre>
	 */
	@Test
	public void testafficheGrilleVide(){
		Vue4x4 vue4x4 = new Vue4x4();
		Scenario scenario = new Scenario();
		scenario.setApplication(() -> vue4x4.afficheGrilleVide());
		scenario.test(0, new TestScenario() {
			@Override
			public void test(String output) {
				Scanner scanner = new Scanner(output);
				Assert.assertEquals(" SUDOKU 4 x 4", scanner.nextLine()); 
				Assert.assertEquals(" ============", scanner.nextLine()); 
				Assert.assertEquals("+-----+-----+", scanner.nextLine()); 
				Assert.assertEquals("| . . | . . |", scanner.nextLine()); 
				Assert.assertEquals("| . . | . . |", scanner.nextLine()); 
				Assert.assertEquals("+-----+-----+", scanner.nextLine()); 
				Assert.assertEquals("| . . | . . |", scanner.nextLine()); 
				Assert.assertEquals("| . . | . . |", scanner.nextLine()); 
				Assert.assertEquals("+-----+-----+", scanner.nextLine()); 
			}
		});
	}
}
