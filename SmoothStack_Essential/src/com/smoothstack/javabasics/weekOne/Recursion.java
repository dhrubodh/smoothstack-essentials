/**
 * 
 */
package com.smoothstack.javabasics.weekOne;

/**
 * @author dhrubo
 *
 */
public class Recursion {
	
	public static void main(String[] args) {
		
		Recursion rc = new Recursion();
		int[] arr1 = new int[]{2,4,8}; 
		System.out.println(rc.groupSumClump(0, arr1, 10));

		int[] arr2 = new int[]{1,2,4,8,1}; 
		System.out.println(rc.groupSumClump(0, arr2, 14));

		int[] arr3 = new int[]{1,4,4,8}; 
		System.out.println(rc.groupSumClump(0, arr3, 14));

	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		// When there are no more groups to process, if target has a remainder
		if (start >= nums.length)
			return target == 0;

		int startOfNextGroup = start;
		int groupSize = 0;

		// Finds start of the next group and finds the size of the current group
		while (startOfNextGroup < nums.length && nums[startOfNextGroup] == nums[start]) {
			startOfNextGroup++;
			groupSize = startOfNextGroup - start;

		// Do not use current group, try next group
		if (groupSumClump(startOfNextGroup, nums, target))
			return true;
		// Use current group, subtract value of current group from target
		if (groupSumClump(startOfNextGroup, nums, target - nums[start] * groupSize))
			return true;
		}

		return false;
	}

}
