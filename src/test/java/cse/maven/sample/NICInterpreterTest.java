package cse.maven.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cse.maven.sample.exception.InvalidNicNumberException;
import static org.testng.Assert.assertEquals;

@Test
public class NICInterpreterTest {

	NICInterpreter interpreter;

	@BeforeClass
	public void setUp() {
		interpreter = new NICInterpreter();
	}

	@Test
	public void createBmiTest1() throws InvalidNicNumberException {
		Person person = interpreter.getDetails("911112418");
		assertEquals(person.getGender(), "Male");
	}

	@Test(expectedExceptions = InvalidNicNumberException.class)
	public void createBmiTest2() throws InvalidNicNumberException {
		Person person = interpreter.getDetails("fsdfsdfsdf");
	}

	@Test
	public void testCalculate1() throws InvalidNicNumberException {
		Person person = interpreter.getDetails("911112418");
		assertEquals(person.getYear(), 1991);
	}

}
