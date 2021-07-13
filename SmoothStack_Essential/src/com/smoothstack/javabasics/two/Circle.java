/**
 * 
 */
package com.smoothstack.javabasics.two;

/**
 * @author dhrubo
 *
 */
public class Circle implements Shape{

	/**
	 * @param args
	 */
	
	static int radius = 5;
	static int area;

	@Override
	public void calculateArea() {
		area = (int) (3.14 * Math.pow(radius, area));
		
	}
	
	public void display() {
		Shape.super.display();
		System.out.println("The area of the circle is: " + area);
	}

}
