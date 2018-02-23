package be.steformations.sudoku;

import org.junit.Before;
import org.junit.Test;

import be.steformations.scenario.Scenario;

/**
 * Test les affichages à partir du lancement de l'application.
 * 
 * @author yannick
 *
 */
public class MainTest {

	private Scenario scenario;

	/**
	 * A l'ouverture l'application affiche le titre.
	 * 
	 * <pre>
	"    SUDOKU"
	"    ======"
	 * </pre>
	 * 
	 */
	@Test
	public void testTitre() {
		StringBuilder builder = new StringBuilder();
		builder.append("    SUDOKU").append(System.lineSeparator());
		builder.append("    ======").append(System.lineSeparator());
		scenario.testAffichago(0, builder.toString());
	}

	@Before
	public void before() {
		Runnable app = new Runnable() {
			
			@Override
			public void run() {
				Main.main(new String[0]);
			}
		};
		scenario = new Scenario(app);
	}
	
	
}
