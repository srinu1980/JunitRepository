package com.cts.test2;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.util.List;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;

public class RunningTestDemo1 {

	public static void main(String[] args) {
		final LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(selectClass(com.cts.test2.TestEmployeeDetails.class)).build();

		final Launcher launcher = LauncherFactory.create();
		final SummaryGeneratingListener listener = new SummaryGeneratingListener();

		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);

		TestExecutionSummary summary = listener.getSummary();
		long testFoundCount = summary.getTestsFoundCount();
		List<Failure> failures = summary.getFailures();
		if (summary.getTestsSucceededCount() == 2) {
			System.out.println("getTestsSucceededCount() : " + summary.getTestsSucceededCount());
			System.out.println("All Test cases Cleared");
		} else {
			int l = (int) summary.getTestsSucceededCount();
			l = 2 - l;
			System.out.println(l + " Testcase failed");
			failures.forEach(
					failure -> System.out.println("failure - " + failure.getTestIdentifier().getDisplayName()));
			failures.forEach(failure -> System.out.println("failure - " + failure.getException()));
			// failures.forEach(failure -> System.out.println("failure - " +
			// failures.get(0).getTestIdentifier()));
		}
	}
}
