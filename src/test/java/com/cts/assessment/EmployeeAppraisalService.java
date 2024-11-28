package com.cts.assessment;

public class EmployeeAppraisalService {

	public static double calculateIncrement(double salary, double rating) {
		double incrementedSalary = 0.0;

		if (rating >= 1 && rating <= 5) {
			if (rating >= 1 && rating <= 3)
				incrementedSalary = salary + (salary * 0.1);
			else if (rating > 3 && rating <= 4)
				incrementedSalary = salary + (salary * 0.2);
			else if (rating > 4 && rating <= 5)
				incrementedSalary = salary + (salary * 0.3);
			return incrementedSalary;
		} else {
			return salary;
		}
	}

}
