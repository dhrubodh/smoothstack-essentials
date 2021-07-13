/**
 * 
 */
package com.smoothstack.javabasics.two;

/**
 * @author dhrubo
 *
 * Interface for various shapes, eg: circle, rectangle
 */
public interface Shape {
	
	public void calculateArea();
	
	default void display() {
		calculateArea();
	};
}
