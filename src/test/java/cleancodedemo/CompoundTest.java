package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundTest {

	@Test
	public void test() {
		InterestDemo i=new InterestDemo();

		assertEquals(16288.95,i.compoundInterest(10000, 10.25, 5),0.0);
		assertEquals(676,i.compoundInterest(625, 4, 2),0.0);

	}

}
