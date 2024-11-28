package com.cts.demo;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MessageUtilTests {
	MessageUtil message = new MessageUtil("Good Morning");

	String msg = "Good Morning";

	int num = 10;

	String str = null;

	@Test
	public void testMethod1() {

		assertEquals(msg, message.getMessage());
		System.out.println("Expected the result.");
	}

	@Test
	@Ignore
	public void testMethod2() {

		assertFalse(num > 50);
		System.out.println("Using AssertFalse Method");
	}

	@Test
	@Ignore
	public void testMethod3() {
		assertNull(str);
		System.out.println("check assertNull or not");
	}

	@Before
	public void greeting() {
		System.out.println("--------------Welcome...............");
	}

	@After
	public void msg() {
		System.out.println("---------------Thank you...............");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("********Start the Test cases*********");
	}

	@AfterClass
	public static void afterclassmethod() {
		System.out.println("#############End the test cases############");
	}

}
