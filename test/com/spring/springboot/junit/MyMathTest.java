package com.spring.springboot.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();
	
	@Test
	void testThreeLengthArray() {
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void testZeroLengthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}
}

// While writing unit tests, absence of failure is success