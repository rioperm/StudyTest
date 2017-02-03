package Test;

import org.junit.Test;

public class CalcuratorTest {
//	
//	public static void main(String[] args){
//		Calculator cal = new Calculator();
//		System.out.println(cal.add(3, 4));
//		System.out.println(cal.subtract(5, 4));
//		System.out.println(cal.multiply(2, 6));
//		System.out.println(cal.divide(8, 4));
//	}
	@Test
	public void add(){
		Calculator cal = new Calculator();
		System.out.println(cal.add(6,3));
	}
	@Test
	public void subtract(){
		Calculator cal = new Calculator();
		System.out.println(cal.subtract(6, 3));
	}
}
