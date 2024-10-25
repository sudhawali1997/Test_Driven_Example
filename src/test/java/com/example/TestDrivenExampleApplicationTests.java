package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDrivenExampleApplicationTests {

	@Test
	public void EmptyString() {
		assertEquals(0, Calculator.add(""));

	}
	
	@Test
	public void addOneString() {
		assertEquals(1, Calculator.add("1"));
	}

}
