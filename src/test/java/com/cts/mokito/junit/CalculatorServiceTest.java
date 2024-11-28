package com.cts.mokito.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@Mock
	private AdditionService additionService;

	@InjectMocks
	private CalculatorService calculatorService;

	@Test
	public void testPerformAddition() {
		// Arrange
		when(additionService.add(10, 20)).thenReturn(30);

		// Act
		int result = calculatorService.performAddition(10, 20);

		// Assert
		assertEquals(30, result);
		verify(additionService).add(10, 20);
	}

}
