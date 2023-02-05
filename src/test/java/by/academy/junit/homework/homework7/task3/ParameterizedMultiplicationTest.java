package by.academy.junit.homework.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedMultiplicationTest {

	private final double number;
	private final double factor;
	private final double expected;

	public ParameterizedMultiplicationTest(double number, double factor, double expected) {
		this.number = number;
		this.factor = factor;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{0} * {1} = {2}")
	public static Iterable<Double[]> dataForMultiplicationTest() {
		return Arrays.asList(
				new Double[][]{
						{2.0, 0.0, 0.0},
						{2.56, -0.1, -0.256},
						{2.1, 1.0, 2.1}
				}
		);
	}

	@Test(timeout = 100)
	public void calculatorMultiplicationTest() {
		SimpleCalculator calculator = new SimpleCalculator();
		Assert.assertEquals(expected, calculator.multiply(number, factor), 0.00000000000002);
	}
}
