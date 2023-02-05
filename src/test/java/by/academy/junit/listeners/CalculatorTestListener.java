package by.academy.junit.listeners;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	private static final Description FAILED = Description.createTestDescription("failed", "failed");

	@Override
	public void testFailure(Failure failure) {
		failure.getDescription().addChild(FAILED);
	}

	@Override
	public void testFinished(Description description) {
		if (!description.getChildren().contains(FAILED)) {
			System.out.println("Successful " + description.getMethodName());
		}
	}
}

