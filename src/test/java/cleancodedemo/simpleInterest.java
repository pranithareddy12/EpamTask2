package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleInterest {

	@Test
	public void test() {
		InterestDemo i=new InterestDemo();
		assertEquals(81,i.simpleInterest(900, 4.5, 2),0.0);
		assertEquals(686,i.simpleInterest(1400, 7, 7),0.0);

	}

}
