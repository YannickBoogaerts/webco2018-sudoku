package be.steformations.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.junit.Assert;

public class StringIteratorInputStream extends InputStream {

	private Iterator<String> iterator;
	private byte[] buf = new byte[0];
	private int pos = 0;
	private boolean end = true;

	public StringIteratorInputStream(Iterator<String> iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public int read() throws IOException {
		if (end){// && iterator.hasNext()) {
			String t = iterator.next() + System.lineSeparator();
			buf = t.getBytes();
			pos = 0;
			end = false;
		}
		if (pos >= buf.length) {
			end = true;
			throw new IOException();
		}

		return buf[pos++];
	}

}
