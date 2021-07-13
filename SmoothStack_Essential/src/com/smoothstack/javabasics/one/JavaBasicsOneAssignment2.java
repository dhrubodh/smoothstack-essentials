/**
 * 
 */
package com.smoothstack.javabasics.one;

import java.util.Scanner;

/**
 * @author dhrubo
 * 
 * Assignment 2
 * 
 * Guessing game
 * User choose a number from 1 to 100 and try to match with the computer generated number
 *
 */
public class JavaBasicsOneAssignment2 {
	
	int number, guess;
	int tries = 5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaBasicsOneAssignment2 assignment2 = new JavaBasicsOneAssignment2();
		assignment2.startGame();

	}
	
	
	Scanner input = new Scanner(System.in);
	
	
	public void startGame() {
		// random generated number
		number = (int) (Math.random() * 100) + 1;
		System.out.println("Guess a number between 1 and 100: ");
		
		//user input
		guess = input.nextInt();
		
		while (tries > 1) {
			if (Math.abs(number - guess) <= 10) {
				System.out.println("Congratulations! The generated number was " + number);
				System.exit(0);
			} else {
				tries--;
				System.out.println("Not close enough! Tries remaining: " + tries + ". Try again: ");
				guess = input.nextInt();
			}
		}
		if (tries == 1)
			System.out.println("Sorry, Game Over! The correct number was " + number);
	}

}
