package com.tdd.demo;

import com.tdd.demo.main.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void add()
	{
		assertEquals(0, Calculator.add(""));
	}

}
