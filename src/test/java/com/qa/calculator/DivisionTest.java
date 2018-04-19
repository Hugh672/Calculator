package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

	private Divider divide;
	
	@Test
	public void test() {
		divide = new Divider();
		int expectedValue = 2;
		int actualValue = divide.divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
