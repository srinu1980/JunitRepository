package com.cts.test1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestDemo2 {

	@Test
	public void testAdd() {

		int num = 5;
		String temp = null;
		String str = "Junit5 test cases";

		assertEquals("Junit5 test cases", str);

		assertFalse(num > 6);

		assertNotNull(temp);
	}
}
