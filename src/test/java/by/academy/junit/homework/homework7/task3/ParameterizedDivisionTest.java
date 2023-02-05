package by.academy.junit.homework.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedDivisionTest extends Assert {

	private final double dividend;
	private final double divider;
	private final double expected;

	public ParameterizedDivisionTest(double dividend, double divider, double expected) {
		this.dividend = dividend;
		this.divider = divider;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{0} / {1} = {2}")
	public static Iterable<Double[]> dataForDivisionTest() {
		return Arrays.asList(
				new Double[][]{
						{0.0, 12.3, 0.0},
						{2.0, 4.0, 0.5},
						{7.0, 1.0, 7.0}
				}
		);
	}

	@Test
	public void calculatorDivisionTest() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(expected, calculator.divide(dividend, divider), 0.00000000000002);
	}
}
