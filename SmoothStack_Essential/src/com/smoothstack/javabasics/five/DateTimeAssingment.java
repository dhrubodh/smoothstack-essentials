/**
 * 
 */
package com.smoothstack.javabasics.five;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author dhrubo
 *
 */
public class DateTimeAssingment {

	/**
	 * @param args
	 * 
	 * 
	 *  1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
  		__ I would use the java.time.LocalDateTime or ZoneDatetime class because both has methods to retrieve all of the fields from year to nanoseconds.
		2. Given a random date, how would you find the date of the previous Thursday?
	
			___ assuming the given date is in LocalDate, by Using previous method of TemporalAdjuster
			LocalDate givenDate = '';
			System.out.println("the previous Thursday is:" + date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY)));
	
	
		3. What is the difference between a ZoneId and a ZoneOffset?
			ZoneID has unique zone names for different regions of the world. For example, EST.
			ZoneOffset is based on the difference from Greenwich/UTC. The EST equivalent would be -05:00.
		4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
			I can use Instant atZone() with the zone ID to convert an Instant to ZonedDateTime.
			...Instant.now().atZone(ZoneId.systemDefault()); 
			To convert ZonedDateTime to an Instant, I can use the toInstant() method:
			... ZonedDateTime.now().toInstant();
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Find the length of each month given a year. \nEnter a year: ");
		Year year = Year.of(input.nextInt());
		lengthOfMonths(year);
		
		System.out.println(
				"\nFind the Mondays of a given month in the current year. \nEnter a month ex(1 for January, 12 for December): ");
		YearMonth yearMonth = YearMonth.of(Year.now().getValue(), Month.of(input.nextInt()));
		mondaysInMonth(yearMonth);
		
		System.out.println("\nCheck if a date is in Friday the 13th."
				+ "\nEnter a month#(1 for January, 12 for December):");
		int m = input.nextInt();
		System.out.println("Enter a day of the month (1-31):");
		int d = input.nextInt();
		System.out.println("Enter a year:");
		int y = input.nextInt();
		LocalDate date = LocalDate.of(y, m, d);
		fridayTheThirteenth(date);
		System.out.println("Thank you for your searching. Goodbye!");
		input.close();

	}
	
	// Question 5: Finds and prints the number of days for each month of a given
	// year
	private static void lengthOfMonths(Year year) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(year.atMonth(i).getMonth() + ": " + year.atMonth(i).lengthOfMonth());
		}
	}
	
	// Question 6: Given a month of the current year, lists all Mondays in that
	// month
	private static void mondaysInMonth(YearMonth yearMonth) {
		System.out.println("The mondays in the month of " + yearMonth.getMonth() + ":");
		for (int i = 1; i <= yearMonth.lengthOfMonth(); i++) {
			if (yearMonth.atDay(i).getDayOfWeek().getValue() == 1)
				System.out.println(yearMonth.getMonthValue() + "/" + i);
		}
	}
	
	// Question 7: Tests whether a given date occurs on Friday the 13th
	private static void fridayTheThirteenth(LocalDate date) {
		if (date.getDayOfWeek().getValue() == 5 && date.getDayOfMonth() == 13)
			System.out.println("This date occurs on Friday the 13th");
		else
			System.out.println("This date does not occur on Friday the 13th");
	}

}
