package com.cts.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestDemo1 {

	MessageUtil messageUtil = new MessageUtil("Hello World");

	String message = "Hello World";

	@Test
	public void testmethod() {
		assertEquals(message, messageUtil.getMessage());
	}
}
