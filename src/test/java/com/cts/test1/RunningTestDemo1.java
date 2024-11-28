package com.cts.test1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunningTestDemo1 {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestDemo1.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("Error: " + failure.toString());
		}
		System.out.println("passed:" + result.wasSuccessful());

	}

}
