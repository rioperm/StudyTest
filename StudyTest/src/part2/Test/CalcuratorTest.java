package part2.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcuratorTest {

	private Calculator cal;
	
	@Before
	public void setup(){
		cal = new Calculator();
		System.out.println("B");
	}
	@Test
	public void subtract(){
		assertEquals(3,cal.subtract(6, 3));
		System.out.println("sub");
	}
	@Test
	public void add(){
		assertEquals(9,cal.add(6, 3));
		System.out.println("add");
	}
	
	@After
	public void teardown(){
		System.out.println("teardown");
	}
}
