package by.academy.junit.homework.homework7.task3;

import by.academy.junit.listeners.TestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class ExponentiationTest extends Assert {

	SimpleCalculator calculator = new SimpleCalculator();

	@Test(timeout = 100)
	public void exponentiationTimeOutTest() {
		assertEquals(4.0, calculator.exponentiation(2.0, 2.0), 0.00000000000002);
	}

	@Test
	public void exponentiationAssertEqualsTest() {
		assertEquals(16.0, calculator.exponentiation(2.0, 4.0), 0.00000000000002);
	}

	@Test
	public void exponentiationAssertNotEqualsTest() {
		assertNotEquals(2.0, calculator.exponentiation(4, 2));
	}
}
