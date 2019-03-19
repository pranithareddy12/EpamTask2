package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		assertEquals(5,c.division(25,5),0.0);
		assertEquals(2.5,c.division(5,2),0.0);
		assertEquals(0,c.division(0,7),0.0);
		assertEquals(1.46,c.division(3.65,2.5),0.0);

	}

}
