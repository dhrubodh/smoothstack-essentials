/**
 * 
 */
package com.smoothstack.javabasics.weekOne;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author dhrubo
 *
 */

@FunctionalInterface
interface PerformOperation {
	boolean intTest(int a);
}


public class Lambdas {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Lambdas lam = new Lambdas();
        try {
        	System.out.println("1) Check Your number if it's odd or even");
        	System.out.println("2) Check Your number if it's Prime or Composite");
        	System.out.println("3) Check Your number if it's a Palindrome");
            System.out.println("Enter the input, beginning with number of test cases: ");
            System.out.println("If you want to check 5 Number then input % first");
            System.out.println("Next, input the test case number from the above and your test number together");
            System.out.println("Example, to check whether 15 is an prime number or composite you should put: 2 15");
            Scanner scanner = new Scanner(System.in);
            int testCases = Integer.parseInt(scanner.nextLine());
            String result = null;
            List<String> results = new ArrayList<>();

            while (testCases-- > 0) {
                String s = scanner.nextLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int testType = Integer.parseInt(st.nextToken());
                int numToTest = Integer.parseInt(st.nextToken());

                if (testType == 1) {
                    result = lam.testType(lam.isOdd(), numToTest) ? "ODD" : "EVEN";
                }
                else if (testType == 2) {
                    result = lam.testType(lam.isPrime(), numToTest) ? "PRIME" : "COMPOSITE";
                }
                else if (testType == 3) {
                    result = lam.testType(lam.isPalindrome(), numToTest) ? "PALINDROME" :  "NOT PALINDROME";
                }

                results.add(result);
            }
            results.forEach(System.out::println);
            scanner.close();

        }
        catch (NumberFormatException e) {
            System.out.println("Please format the input correctly as an integer!");
        }
        catch (NoSuchElementException e) {
            System.out.println("Please Enter two number using a space in between! First Integer is for TestCase number! Second One is your number that you want to check.");
        }

	}
	
    public boolean testType(PerformOperation p, int i){
        return p.intTest(i);
    }

    public PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return num -> {
//        	edge cases
            if (num < 2) 
            	return false;
//            check if the number is divisible for prime
            for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0)
					return false;
			}
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return num -> {
            String s = String.valueOf(num);
            String reverse = new StringBuffer(s).reverse().toString();
            return s.equals(reverse);
        };
    }

}
