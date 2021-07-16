/**
 * 
 */
package com.smoothstack.javabasics.weekOne;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dhrubo
 *
 */
public class Functional {
	
    public List<Integer> rightDigit (List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }

    //method that doubles each integer of a list of integers
    public List<Integer> doubling (List<Integer> nums) {
        return nums.stream().map(n -> n *2).collect(Collectors.toList());
    }

    // method that replaces the "x" in a list of strings with ""
    public List<String> noX (List<String> strings) {
        return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
    }
}
