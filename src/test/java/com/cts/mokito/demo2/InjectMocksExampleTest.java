package com.cts.mokito.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

interface Repository {
	String getData();
}

class Service {
	private final Repository repository;

	public Service(Repository repository) {
		this.repository = repository;
	}

	public String fetchData() {
		return repository.getData();
	}
}

@ExtendWith(MockitoExtension.class)
public class InjectMocksExampleTest {

	@Mock
	private Repository mockRepository;

	@InjectMocks
	private Service service;

	@Test
	public void testInjectMocks() {
		when(mockRepository.getData()).thenReturn("mocked data");

		String result = service.fetchData();

		assertEquals("mocked data", result);
	}
}