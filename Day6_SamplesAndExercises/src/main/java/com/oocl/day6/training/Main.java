package com.oocl.day6.training;



public class Main {

	public static void main(String[] args) {
		runner run1 = new runner();
		runner run2 = new runner();

		run1.start();
		run2.start();

	}

}
class runner extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

