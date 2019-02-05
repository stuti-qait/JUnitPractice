package com.qait.practice.consletter;
import org.junit.*;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class TestConsLetters {

	@Test
	public void testLetters() {
		ConsLetters cons = new ConsLetters();
		ArrayList<String> InputList = new ArrayList<String>();
		ArrayList<String> expectedList = new ArrayList<String>();
		InputList.add("apple");
		InputList.add("banana");
		InputList.add("guava");
		
		expectedList.add("apple");
		
		ArrayList<String> result = cons.checkEquals(InputList);
		
		
		assertEquals("arraylist doesn't match", result, expectedList);
		
		
	}

	
}

	