/**
 * 
 */
package com.smoothstack.javabasics.three;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author dhrubo
 * 
 * 
 * Write text to a file
 *
 */
public class JavaBasicsThreeAssignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the texts you would like to write: ");
		
			String input = scanner.nextLine();
			
			JavaBasicsThreeAssignment2 writeText = new JavaBasicsThreeAssignment2();
			
			writeText.write(input);
			
			System.out.println("Appended to file. Goodbye.");
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("You didn't enter anything!");
		}

	}
	
	private void write(String str) {
		try (FileWriter fw = new FileWriter("src/resources/test-file-1", true)) {
			fw.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No such file!");
		}
	}

}
