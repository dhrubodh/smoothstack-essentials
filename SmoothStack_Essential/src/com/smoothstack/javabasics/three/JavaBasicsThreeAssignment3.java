/**
 * 
 */
package com.smoothstack.javabasics.three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author dhrubo
 *
 */
public class JavaBasicsThreeAssignment3 {

	/**
	 * @param args
	 */
	
	private String path = "src/resources/test-file-1";
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("Which character would you like to search the file for? ");
			String input = scanner.next();
			JavaBasicsThreeAssignment3 countCharacter = new JavaBasicsThreeAssignment3();
			countCharacter.CountChar(input);
		}

	}
	
	private void CountChar(String str) {
		int count = 0;
		
		try (FileReader fr = new FileReader(this.path)){
			
			int data = fr.read();
			
			while (data != -1) {
				if ((char) data == str.toCharArray()[0]) {
					count++;
				}
				data = fr.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The file does not exist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The character appears " + count + " times in the file.");
	}

}
