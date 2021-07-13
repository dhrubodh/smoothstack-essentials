/**
 * 
 */
package com.smoothstack.javabasics.one;

/**
 * @author dhrubo
 * 
 * SmoothStack Essentials JAVA Basic 1
 *
 */
public class JavaBasicsOneAssignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaBasicsOneAssignment1 assingmnet1 = new JavaBasicsOneAssignment1();
		assingmnet1.printPatterns();

	}
	
	/**
	 * Pattern one
	 */
	private void patternOne() {
		String currentLine = "";
		String lastLine = "";
		for (int i = 0; i < 4; i++) {
			currentLine = currentLine + "*";
			lastLine = lastLine + "..";
			System.out.println(currentLine);
		}
		System.out.println(lastLine + ".\n");
	}

	/**
	 * Pattern two
	 */
	private void patternTwo() {
		String firstLine = "";
		String currentLine = "";

		for (int i = 0; i < 4; i++) {
			currentLine = currentLine + "*";
			firstLine = firstLine + "..";
		}

		System.out.println(firstLine + ".");

		for (int i = 4; i > 0; i--) {
			currentLine = currentLine.substring(0, i);
			System.out.println(currentLine);
		}
		System.out.println();
	}

	/**
	 * Pattern three
	 */
	private void patternThree() {
		String firstAsterisk = "*";
		String asterisks = "";
		String space = "     ";
		String lastLine = "";

		for (int i = 0; i < 4; i++) {
			System.out.println(space + asterisks + firstAsterisk + asterisks + space);
			space = space.substring(0, space.length() - 1);
			asterisks = asterisks + "*";
			lastLine = lastLine + ".";
		}
		System.out.println(lastLine + "..." + lastLine + "\n");
	}

	/**
	 * Pattern four
	 */
	private void patternFour() {
		String firstLine = "";
		String firstAsterisk = "*";
		String asterisks = "***";
		String space = "  ";

		for (int i = 0; i < 5; i++) {
			firstLine = firstLine + ".";
		}

		System.out.println(firstLine + "." + firstLine);
		System.out.println(space + asterisks + firstAsterisk + asterisks + space);

		for (int i = 0; i < 3; i++) {
			space = space + " ";
			asterisks = asterisks.substring(0, asterisks.length() - 1);
			System.out.println(space + asterisks + firstAsterisk + asterisks + space);
		}
	}

	/**
	 * Prints all the pattern 
	 */
	public void printPatterns() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + ")");

			switch (i) {
			case 1:
				patternOne();
				break;
			case 2:
				patternTwo();
				break;
			case 3:
				patternThree();
				break;
			case 4:
				patternFour();
				break;
			default:
				System.out.println("Error! Something went wrong.\n");
			}
		}
	}

}
