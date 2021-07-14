/**
 * 
 */
package com.smoothstack.javabasics.four;

/**
 * @author dhrubo
 * 
 * 
 * 
 * Deadlock Demo
 *
 */
public class JavaBasicsFourAssignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String resource1 = "I am the first resource";
		String resource2 = "I am the second resource";

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {

				try {
					synchronized (resource1) {
						Thread.sleep(100);
						synchronized (resource2) {
							System.out.println("Thread 1 has locked both resource 1 and resource 2");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {

				try {
					synchronized (resource2) {
						Thread.sleep(100);
						synchronized (resource1) {
							System.out.println("Thread 2 has locked both resource 1 and resource 2");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		};

		new Thread(runnable1).start();
		new Thread(runnable2).start();

	}

}
