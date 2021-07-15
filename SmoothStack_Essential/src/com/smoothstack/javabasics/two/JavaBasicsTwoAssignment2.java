/**
 * 
 */
package com.smoothstack.javabasics.two;

import java.util.Arrays;

/**
 * @author dhrubo
 * 
 * Construct a 2D Array, Populate the matrix with random integers, then find the maximum value in the matrix.
 *
 */
public class JavaBasicsTwoAssignment2 {

	/**
	 * @param args
	 */
	
	// A 4 by 4 matrix
	int nestedArray [][] = new int[4][4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBasicsTwoAssignment2 findMax = new JavaBasicsTwoAssignment2();
		findMax.findMax();
	}
	
	private void construct2DArray() {
		for (int i = 0; i < nestedArray.length; i++) {
			for(int j = 0; j < nestedArray[i].length; j++) {
				nestedArray[i][j] = ((int) (Math.random() * 100));
			}
		}
		
		System.out.println(Arrays.deepToString(nestedArray));
	}
	
	private void findMax() {
		construct2DArray();
		
		int max = 0;
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < nestedArray.length; i++) {
			for (int j = 0; j < nestedArray[i].length; j++) {
				if(max < nestedArray[i][j]) {
					max = nestedArray[i][j];
					row = i + 1;
					column = j + 1;
				}
			}
		}
		
		System.out.println("The maximum number in this 2D array is: " + max);
		System.out.println("Max is located at row " + row + " and Column " + column);
	}

}
