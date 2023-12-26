package com.spring.springboot.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	private List<String> courses = Arrays.asList("AWS","React","Spring");
	private int[] ids = {1,5,8};
	
	@Test
	void test() {
		boolean testAWS = courses.contains("AWS"); // true
		boolean testGCP = courses.contains("GCP"); // false
		int testSize = courses.size();             // 3
		
		// testAWS
		assertEquals(true,testAWS);
		assertTrue(testAWS);
		
		// testGCP
		assertEquals(false,testGCP);
		assertFalse(testGCP);
		
		// testSize
		assertEquals(3,testSize);
		
		// Comparing 2 arrays 
		assertArrayEquals(new int[] {1,5,8}, ids);
	}

}
