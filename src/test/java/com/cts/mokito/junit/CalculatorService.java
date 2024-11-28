package com.cts.mokito.junit;

public class CalculatorService {

	private AdditionService additionService;

	public CalculatorService(AdditionService additionService) {
		this.additionService = additionService;
	}

	public int performAddition(int a, int b) {
		return additionService.add(a, b);
	}

}
