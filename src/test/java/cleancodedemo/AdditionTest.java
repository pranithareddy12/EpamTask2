package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		assertEquals(101,c.addition(45,56),0.0);
		assertEquals(15.7,c.addition(12.4,3.3),0.0);
		assertEquals(77,c.addition(76,0,1),0.0);
		assertEquals(9.7,c.addition(6,-1.3,5,0),0.0);


	}

}
