/**
 * 
 */
package com.smoothstack.javabasics.two;

/**
 * @author dhrubo
 *
 */
public class JavaBasicsTwoAssignment1 {

	/**
	 * @param args
	 * 
	 * Take arguments from command line and add only the numbers return the strings
	 */
	public static void main(String[] args) {
		double sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			
			boolean isNumeric = true;
			Double num = null;
			
//			check and convert the strings to a double and save it to the  variable
			
			try {
				num = Double.parseDouble(args[i]);
			} catch (NumberFormatException e) {
				isNumeric = false;
			}
			
			//if it passes add num to the sum
			
			if (isNumeric) {
				sum += num;
			}
			
		}
		
		System.out.println("Total sum of the digits are " + sum);

	}

}
