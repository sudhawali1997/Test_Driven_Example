package com.in;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddExampleApplicationTests {

	@Test
	public void add () {
	assertEquals(0,Calculator.add(""));
	
	}
	
	@Test
	public void testOneNumber() {
	assertEquals(1,Calculator.add("1"));
	}

}
