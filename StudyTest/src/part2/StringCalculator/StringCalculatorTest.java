package part2.StringCalculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup(){
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null(){
		assertEquals(0,cal.add(null));
		assertEquals(0,cal.add(""));
	}
	
	@Test(expected = RuntimeException.class)
	public void add_negative() throws Exception{
		cal.add("1,-2,3");
	}
	
	@Test
	public void add_one() throws Exception{
		assertEquals(6,cal.add("1,2:3"));
		assertEquals(2,cal.add("2"));
		assertEquals(6,cal.add("//;\n1;2;3"));
	}
	
	
}