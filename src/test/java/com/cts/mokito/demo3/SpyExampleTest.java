package com.cts.mokito.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

class User {
	public String getName() {
		return "Real Name";
	}
}

@ExtendWith(MockitoExtension.class)
public class SpyExampleTest {

	@Spy
	private User user;

	@Test
	public void testSpy() {
		when(user.getName()).thenReturn("Mocked Name");

		String name = user.getName();

		assertEquals("Mocked Name", name);
	}
}
