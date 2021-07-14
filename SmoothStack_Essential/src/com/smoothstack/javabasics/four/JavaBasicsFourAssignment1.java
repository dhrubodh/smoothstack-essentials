/**
 * 
 */
package com.smoothstack.javabasics.four;

/**
 * @author dhrubo
 * 
 * 
 * Doublechecked singleton Demo
 *
 */
public class JavaBasicsFourAssignment1 {

	private static volatile JavaBasicsFourAssignment1 instanceObj = null;

	public static JavaBasicsFourAssignment1 getInstance() {
		if (instanceObj == null) {
			synchronized (JavaBasicsFourAssignment1.class) {
				if (instanceObj == null) {
					instanceObj = new JavaBasicsFourAssignment1();
				}
			}
		}

		return instanceObj;
	}

}
