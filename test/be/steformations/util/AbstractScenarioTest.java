package be.steformations.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractScenarioTest implements Iterator<String> {

	@Override
	public boolean hasNext() {
		return this.input.hasNext();
	}

	@Override
	public String next() {
		String next = null;
		if (this.step == this.testStep) {
			this.test(out.toString());
		}
		out.reset();
		if (this.input.hasNext()) {
			this.step++;
			next = this.input.next();
		} else {
			Assert.fail(String.format("Scenario finish before the end of application (%s)", this.step));
		}
		return next;
	}

	private int step;
	private int testStep = 0;
	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	private Iterator<String> input;

	@Test
	public void testScenario() {
		InputStream sin = System.in;
		PrintStream sout = System.out;
		try {
			List<String> list = getInput();
			this.input = list.iterator();
			this.step = 0;
			this.testStep = getStep();
			System.setIn(new StringIteratorInputStream(this));
			System.setOut(new PrintStream(out, true));
			this.run();
			if (this.step == this.testStep) {
				this.test(out.toString());
			} else if (this.step < this.testStep) {
				Assert.fail(String.format("Application stop before test  (%s/%s)", this.step, this.testStep));
			} else if (this.input.hasNext()) {
				Assert.fail(
						String.format("Application stop before the end of scenario  (%s/%s)", this.step, list.size()));
			}
			// }catch(Throwable e){
			// e.printStackTrace(sout);
		} finally {
			System.setIn(sin);
			System.setOut(sout);
		}

	}

	public abstract List<String> getInput();

	public abstract void test(String out);

	public abstract void run();

	public abstract int getStep();

}
