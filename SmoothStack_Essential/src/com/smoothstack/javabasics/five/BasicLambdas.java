/**
 * 
 */
package com.smoothstack.javabasics.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dhrubo
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	
	public static String resultString = "";
	public static void main(String[] args) {
		BasicLambdas bl = new BasicLambdas();
		String[] list = new String[] { "Ranvir", "Clark", "Sam", "Dhrubo", "Etrogan", "Bruce Wayne" };
		List<Integer> numbers = Arrays.asList(234, 3241, 55, 88, 23, 322, 215);
		
		bl.basicLambdas1(list);
		
		System.out.println("\n" + bl.basicLamdas2(numbers) + "\n");
		
		List<String> startList = Arrays.asList("apple", "bill", "c13", "abc", "A32", "a12", "a123", "aka");
		List<String> newList = bl.basicLamdas3(startList);
		newList.forEach(ele -> System.out.println(ele));
	}
	
	private void basicLambdas1(String[] list) {
		// Sort by shortest to longest
		Arrays.sort(list, (a, b) -> a.length() - b.length());
		System.out.println("Sorted by shortest to longest:");
		for (String i : list)
			System.out.println(i);
		// Sort by reverse longest to shortest
		Arrays.sort(list, (a, b) -> b.length() - a.length());
		System.out.println("\nSorted by longest to shortest:");
		for (String i : list)
			System.out.println(i);
		// Sort alphabetically by first character 
		Arrays.sort(list, (a, b) -> a.charAt(0) - b.charAt(0));
		System.out.println("\nSorted alphabetically by first character only:");
		for (String i : list)
			System.out.println(i);
		// Strings that contain "e" first
		Arrays.sort(list, (a, b) -> (a.contains("e") || a.contains("E") ? 0 : 1) -
				(b.contains("e") || b.contains("E") ? 0 : 1));
		System.out.println("\nStrings that contain \"e\" first:");
		for (String i : list)
			System.out.println(i);
		// Strings that contain "e" first
		// Uses static helper method
		Arrays.sort(list, (a, b) -> detectEHelper(a, b));
		System.out.println("\nStrings that contain \"e\" first(using helper method):");
		for (String i : list)
			System.out.println(i);
	}
	
	public String basicLamdas2(List<Integer> list) {
		
		list.forEach(num -> {
			
			// is divisible by 2 so even
			
			if (num % 2 == 0) {
				resultString += "e" + num + ",";
				// is not divisible by 2 so odd
			} else {
				resultString += "o" + num + ",";
			}
			
		});
		
//		remove the last ","
		
		return resultString.substring(0, resultString.length() - 1);
	}
	
	public List<String> basicLamdas3(List<String> list) {
		return list.stream().filter(element -> element.startsWith("a") && element.length() == 3)
				.collect(Collectors.toList());
	}
	
	
	public static Integer detectEHelper(String a, String b) {
		int aContainsE;
		int bContainsE;
		
//		set the value based on if the string contains e || E
		
		if (a.contains("e") || a.contains("E"))
			aContainsE = 0;
		else
			aContainsE = 1;

		if (b.contains("e") || b.contains("E"))
			bContainsE = 0;
		else
			bContainsE = 1;

		return aContainsE - bContainsE;

	}

}
