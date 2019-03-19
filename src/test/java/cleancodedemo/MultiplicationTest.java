package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void test() {
		Calculator c=new Calculator();

		assertEquals(2520,c.multiplication(45,56),0.0);
		assertEquals(40.92,c.multiplication(12.4,3.3),0.0);
		assertEquals(0,c.multiplication(76,0,1),0.0);
       assertEquals(0,c.multiplication(6,-1.3,5,0),0.0);


	}

}
