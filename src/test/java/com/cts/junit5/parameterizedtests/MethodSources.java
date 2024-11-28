package com.cts.junit5.parameterizedtests;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public class MethodSources {

	public static Stream<Arguments> msMP() {
		return Stream.of(Arguments.of(1, "A"), Arguments.of(2, "B"), Arguments.of(3, "C"));
	}
}
