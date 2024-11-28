package com.cts.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class - @AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Set Up @BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tear Down @AfterEach");
	}

	@Test
	void test_add() {
		assertEquals(10, MyUtils.add(5, 5));
	}

	@Test
	void test_reverse() {
		assertEquals("cba", MyUtils.reverse("abc"));
	}
}
