package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	private Subtract subtract;
	
	@Test
	public void test() {
		subtract = new Subtract();
		int expectedValue = 2;
		int actualValue = Subtract.subtract(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
