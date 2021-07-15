/**
 * 
 */
package com.smoothstack.javabasics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.smoothstack.javabasics.five.BasicLambdas;

/**
 * @author dhrubo
 *
 */
public class JavaBasicsFiveTests {
	
	@Test
	public void detectEHelperTest() {
		String str1 = "Hey";
		String str2 = "Hi";
		String str3 = "Hello";
		
		assertEquals(-1, BasicLambdas.detectEHelper(str1, str2), 0.0001);
		assertEquals(1, BasicLambdas.detectEHelper(str2, str1), 0.0001);
		assertEquals(0, BasicLambdas.detectEHelper(str1, str3), 0.0001);
		assertNotEquals(1, BasicLambdas.detectEHelper(str1, str3), 0.0001);
	}
	
	@Test
	public void basicLamdas2Test() {
		
		BasicLambdas bl = new BasicLambdas();
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		String expectedResult = "o1,e2,o3,e4";
		
		assertEquals(expectedResult, bl.basicLamdas2(numbers));
		assertNotEquals("e1,o2,e3,o4", bl.basicLamdas2(numbers));
		
	}
	
	@Test
	public void basicLamdas3Test() {
		BasicLambdas bl = new BasicLambdas();
		List<String> list = Arrays.asList("apple", "abc", "a12", "broad", "aka");
		List<String> expectedList = Arrays.asList("abc", "a12", "aka");
		List<String> errorList = Arrays.asList("apple", "abc", "a12", "aka");
		
		assertEquals(expectedList, bl.basicLamdas3(list));
		assertNotEquals(errorList, bl.basicLamdas3(list));
	}

}
