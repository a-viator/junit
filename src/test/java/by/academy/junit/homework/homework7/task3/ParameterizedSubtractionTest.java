package by.academy.junit.homework.homework7.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedSubtractionTest {

	private final double minuend;
	private final double subtrahend;
	private final double expected;

	public ParameterizedSubtractionTest(double minuend, double subtrahend, double expected) {
		this.minuend = minuend;
		this.subtrahend = subtrahend;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{0} - {1} = {2}")
	public static Iterable<Double[]> dataForSubtractionTest() {
		return Arrays.asList(
				new Double[][]{
						{0.0, 2.5, -2.5},
						{7.5, 0.0, 7.5},
						{3.56, 3.56, 0.0}
				}
		);
	}

	@Test(timeout = 100)
	public void calculatorSubtractionTest() {
		SimpleCalculator calculator = new SimpleCalculator();
		Assert.assertEquals(expected, calculator.subtraction(minuend, subtrahend), 0.00000000000002);
	}

}
