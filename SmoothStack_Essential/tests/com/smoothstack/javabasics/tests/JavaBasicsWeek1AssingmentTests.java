/**
 * 
 */
package com.smoothstack.javabasics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.smoothstack.javabasics.weekOne.Functional;
import com.smoothstack.javabasics.weekOne.Lambdas;
import com.smoothstack.javabasics.weekOne.Recursion;

/**
 * @author dhrubo
 *
 */
public class JavaBasicsWeek1AssingmentTests {
	
	Lambdas lam = new Lambdas();
	Functional fn = new Functional();
	
	@Test
	public void isOddTest() {
		int testNumber1 = 3;
		int testNumber2 = 6;
	
		assertEquals(true, lam.testType(lam.isOdd(), testNumber1));
		assertNotEquals(true, lam.testType(lam.isOdd(), testNumber2));
	}
	
	@Test
	public void isPrimeTest() {
		int testNumber1 = 3;
		int testNumber2 = 6;
		int testNumber3 = 1;
	
		assertEquals(true, lam.testType(lam.isPrime(), testNumber1));
		assertNotEquals(true, lam.testType(lam.isPrime(), testNumber2));
		assertEquals(false, lam.testType(lam.isPrime(), testNumber3));
		assertNotEquals(true, lam.testType(lam.isPrime(), testNumber3));
	}
	
	@Test
	public void isPalindromeTest() {
		int testNumber1 = 383;
		int testNumber2 = 645;
	
		assertEquals(true, lam.testType(lam.isPalindrome(), testNumber1));
		assertNotEquals(true, lam.testType(lam.isPalindrome(), testNumber2));
	}
	
	@Test
	public void rightDigitTest() {
		List<Integer> list = Arrays.asList(1, 22, 93);	
		List <Integer> expectedList = Arrays.asList(1, 2, 3);
		List<Integer> errorList1 = Arrays.asList(1, 2, 9);
		List<Integer> errorList2 = Arrays.asList(1, 22, 93);
		
		assertEquals(expectedList, fn.rightDigit(list));
		assertNotEquals(errorList1, fn.rightDigit(list));
		assertNotEquals(errorList2, fn.rightDigit(list));
	}
	
	@Test
	public void doublingTest() {
		List<Integer> list = Arrays.asList(1, 2, 3);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		List <Integer> expectedList = Arrays.asList(2, 4, 6);
		List<Integer> errorList1 = Arrays.asList(1, 2, 3);
		List<Integer> errorList2 = Arrays.asList(1, 22, 93);
		
		assertEquals(expectedList, fn.doubling(list));
		assertEquals(list2, fn.doubling(list2));
		assertNotEquals(errorList1, fn.doubling(list));
		assertNotEquals(errorList2, fn.doubling(list));
	}
	
	@Test
	public void noXTest() {
		List<String> list = Arrays.asList("ax", "bb", "cx");	
		List <String> expectedList = Arrays.asList("a", "bb", "c");
		List<String> errorList1 = Arrays.asList("ax", "bb", "c");
		
		assertEquals(expectedList, fn.noX(list));
		assertNotEquals(errorList1, fn.noX(list));
	
	}
	
	@Test
	public void recursionTest() {
		Recursion rc = new Recursion();
		int[] arr1 = new int[]{1,2,4,8,1};
		int[] arr2 = new int[]{1,4,4,8};
		
		assertEquals(true, rc.groupSumClump(0, arr1, 14));
		assertEquals(false, rc.groupSumClump(0, arr2, 14));
		assertNotEquals(true, rc.groupSumClump(0, arr2, 14));
	}

}
