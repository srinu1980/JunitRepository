package com.cts.mokito.demo1;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockExampleTest {

	@Mock
	private List<String> mockList;

	@Test
	public void testMock() {
		mockList.add("test");
		verify(mockList).add("test");
	}
}
