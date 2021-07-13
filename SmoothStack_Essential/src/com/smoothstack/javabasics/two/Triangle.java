/**
 * 
 */
package com.smoothstack.javabasics.two;

/**
 * @author dhrubo
 *
 */
public class Triangle implements Shape{
	
	int base = 5;
	int height = 5;
	int area;

	@Override
	public void calculateArea() {
		area = (int) (base * height) / 2;
		
	}
	
	public void display() {
		Shape.super.display();
		System.out.println("The area of the Triangle is: " + area);
	}

}
