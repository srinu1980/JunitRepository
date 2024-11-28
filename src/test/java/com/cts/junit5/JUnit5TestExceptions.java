package com.cts.junit5;

//https://github.com/WebJournal/journaldev/tree/master/JUnit5-Example/src/test/java/com/journaldev
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class JUnit5TestExceptions {
	@Test
	void test() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());

		Foo foo = new Foo();
		Exception exception = assertThrows(Exception.class, () -> foo.foo());
		assertEquals("Exception Message", exception.getMessage());
	}

}

class Foo {
	void foo() throws Exception {
		throw new Exception("Exception Message");
	}
}
