package cleancodedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CostEstimateTest {

	@Test
	public void test() {
		HouseCost c=new HouseCost();
		assertEquals(4500,c.CalCost(3, "abovestandard"),0.0);
		assertEquals(5400,c.CalCost(3, "highstandard"),0.0);
	}

}
