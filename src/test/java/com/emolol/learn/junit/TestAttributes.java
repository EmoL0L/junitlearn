package com.emolol.learn.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAttributes {

	String message = "Robert";

	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, message);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException() {
		int p = 1 / 0;
	}
}
