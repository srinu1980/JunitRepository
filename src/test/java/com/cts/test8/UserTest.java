package com.cts.test8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class UserTest {
	private User user;

	@BeforeEach
	void setup() {
		user = new User();
	}

	@Test
	void exceptionTesting() {
		// set up user
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> user.setAge("A"));
		assertEquals("Age must be an Integer.", exception.getMessage());
	}

	// This is date used for the test
	private class User {

		// not really a setter, just here to demonstrate how the test works
		public void setAge(String ageString) {
			try {
				Integer.parseInt(ageString);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Age must be an Integer.");
			}
		}

	}
}
