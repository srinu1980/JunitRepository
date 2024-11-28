package com.cts.assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EmployeeAppraisalParameterizedTest {
	@ParameterizedTest
	@MethodSource("data")
	public void testCalculateIncrement(String empId, String name, String dept, double salary, double rating,
			double incrementedSalary) throws Exception {
		EmployeeAppraisalService obj = new EmployeeAppraisalService();
		double res = obj.calculateIncrement(salary, rating);
		assertEquals(incrementedSalary, res, 0.0);
	}

	private static Stream<Arguments> data() {
		return Stream.of(Arguments.of("EMP01", "Alan", "HR", 25000.0, 1, 27500.0),
				Arguments.of("EMP02", "Diana", "Manager", 30000.0, 3, 33000.0),
				Arguments.of("EMP03", "Steve", "HR", 30000.0, 3.1, 36000.0),
				Arguments.of("EMP04", "Mary", "Manager", 32000.0, 4, 38400.0),
				Arguments.of("EMP05", "Peter", "HR", 32000.0, 4.1, 41600.0));

	}
}
