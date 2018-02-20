package be.steformations.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;

public class TestAbstractScenario extends AbstractScenarioTest {

	@Override
	public List<String> getInput() {
		return Arrays.asList(new String[]{"11","",""});
	}

	@Override
	public void test(String out) {
		Assert.assertEquals("�&�\"'(��!��)-", out);
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�&�\"'(��!��)-");
		scan.nextLine();
		System.out.print("BB");
		scan.nextLine();
		System.out.print("CC");
		scan.nextLine();
		System.out.print("DD");

	}

	@Override
	public int getStep() {
		return 0;
	}

}
