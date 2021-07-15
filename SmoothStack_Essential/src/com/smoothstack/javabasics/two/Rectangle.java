/**
 * 
 */
package com.smoothstack.javabasics.two;

/**
 * @author dhrubo
 *
 */
public class Rectangle implements Shape {
	
	int length = 5;
	int width = 5;
	int area;

	@Override
	public void calculateArea() {
		area = length * width;
		
	}
	
	public void display() {
		calculateArea();
		System.out.println("The area of the Rectangle is: " + area);
	}

}
