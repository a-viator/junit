/*
 *  Задача 3. jUnit тестирование.
 *
 * 1) создаем 3 класса-теста
 * 2) каждый из которых будет тестировать одну функцию калькулятора
 * 3) протестировать методы 3 наборами данных (используем Parametrize)
 * 4) написать 2 класса, в которых вы напишите тесты на Math библиотеку( любую функцию), объеденить их в Test Suite.
 * 5) добавить CalculatorTestListener, переопределить,
 * метод который вызывается на успешное завершение теста и выводит на экран название нашего метода.
 */

package by.academy.junit.homework.homework7.task3;

public class SimpleCalculator {

	SimpleCalculator() {
		super();
	}

	public double sum(double number, double addend) {
		return number + addend;
	}

	public double subtraction(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

	public double multiply(double number, double factor) {
		return number * factor;
	}

	public double divide(double dividend, double divider) {
		return dividend / divider;
	}

	public double exponentiation(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public double squareRoot(double number) {
		return Math.sqrt(number);
	}
}
