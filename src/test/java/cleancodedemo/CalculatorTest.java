package cleancodedemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdditionTest.class, DivisionTest.class, MultiplicationTest.class })
public class CalculatorTest {

}
