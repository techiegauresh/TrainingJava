package com.learn.thread;

public class FirstProgram {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new SampleThread1());
		thread1.start();
		
		Thread thread2 = new Thread(new SampleThread1());
		thread2.start();
	}

}

class SampleThread1 implements Runnable {
	public void run() {
		for(int i=0;i < 1000; i++) {
			System.out.println("Printing : " + Thread.currentThread().getId() + " : " + i );
		}
	}
}