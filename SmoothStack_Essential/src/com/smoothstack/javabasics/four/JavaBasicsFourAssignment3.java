/**
 * 
 */
package com.smoothstack.javabasics.four;

import java.util.ArrayList;

/**
 * @author dhrubo
 *
 */
public class JavaBasicsFourAssignment3 {

	/**
	 * @param args
	 */
	
	private ArrayList<Integer> bufferArray = new ArrayList<>();
	private Integer capacity = 10;
	int randomNumber = 0;
	
	public static void main(String[] args) {
		
		final JavaBasicsFourAssignment3 pcInstance = new JavaBasicsFourAssignment3();
		
//		Creating Producer thread
		Thread thread1 = new Thread(() -> {
			try {
				pcInstance.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
//		Creating Consumer thread

		Thread thread2 = new Thread(() -> {
			try {
				pcInstance.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		thread1.start();
		thread2.start();

	}
	
	private void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				randomNumber = (int) (Math.random() * 100);
				if (bufferArray.size() < capacity) {
					bufferArray.add(randomNumber);
					System.out.println("New item added by the producer: " + randomNumber);
//					System.out.println(bufferArray);
				}
			}
			Thread.sleep(1000);
		}
	}

	private void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (bufferArray.size() > 0) {
					System.out.println("New item consumed by the consumer: " + bufferArray.get(0));
					bufferArray.remove(0);
				}
			}
			Thread.sleep(1000);
		}
	}

}
