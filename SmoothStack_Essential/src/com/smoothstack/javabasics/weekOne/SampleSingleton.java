/**
 * 
 */
package com.smoothstack.javabasics.weekOne;

/**
 * @author dhrubo
 *
 */
public class SampleSingleton {
	
//	added volatile to ensure proper sync
	private static volatile SampleSingleton instance = null;
	
	private SampleSingleton() {}
	
	public static SampleSingleton getInstance() {
		
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}

}
