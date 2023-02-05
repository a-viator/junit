package by.academy.junit.homework.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizeSumTest extends Assert {

	private final double number;
	private final double addend;
	private final double expected;

	public ParameterizeSumTest(double number, double addend, double expected) {
		this.number = number;
		this.addend = addend;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{0} + {1} = {2}")
	public static Iterable<Double[]> dataForSumTest() {
		return Arrays.asList(
				new Double[][]{
						{1.0, 2.1, 3.1},
						{-1.0, 5.0, 4.0},
						{0.0, 0.0, 0.0}});
	}

	@Test(timeout = 100)
	public void calculatorSumTest() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(expected, calculator.sum(number, addend), 0.00000000000002);
	}
}
