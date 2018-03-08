package be.steformations.sudoku.menu;

import java.util.Collection;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class GeneriqueTest {

	@Test
	public void testItemGetSetStringValue(){
		Item<String> item = new Item<String>("a","libel 1");
		item.setValue("toto");
		String s = item.getValue();
		Assert.assertEquals("toto", s);
	}
	
	@Test
	public void testItemGetSetGregorianCalendarValue(){
		Item<GregorianCalendar> item = new Item<GregorianCalendar>("a","libel 1");
		GregorianCalendar date = new GregorianCalendar();
		item.setValue(date);
		GregorianCalendar d = item.getValue();
		Assert.assertEquals(date, d);
	}
	
	@Test
	public void testMenu(){
		Item<String> item1 = new Item<String>("a","libel 1");
		item1.setValue("toto");
		Item<String> item2 = new Item<String>("b","libel 2");
		item2.setValue("dede");
		Menu<String> menu = new Menu<String>();
		menu.add(item1);
		menu.add(item2);
		Collection<Item<String>> items = menu.getItems();
	}
	
}
