package by.academy.junit.homework.homework7.task3;

import org.junit.Assert;
import org.junit.Test;

public class SquareRootTest extends Assert {

	SimpleCalculator calculator = new SimpleCalculator();

	@Test(timeout = 100)
	public void squareRootTimeOutTest() {
		assertEquals(4.0, calculator.squareRoot(16), 0.00000000000002);
	}

	@Test
	public void squareRootAssertEqualsTest() {
		assertEquals(16.0, calculator.squareRoot(256), 0.00000000000002);
	}

	@Test
	public void squareRootAssertNotEqualsTest() {
		assertNotEquals(2.0, calculator.squareRoot(250));
	}
}
