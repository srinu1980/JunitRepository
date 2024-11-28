package com.cts.mokito.demo4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CaptorExampleTest {

	@Mock
	private List<String> mockList;

	@Captor
	private ArgumentCaptor<String> captor;

	@Test
	public void testCaptor() {
		mockList.add("test");

		verify(mockList).add(captor.capture());

		assertEquals("test", captor.getValue());
	}
}