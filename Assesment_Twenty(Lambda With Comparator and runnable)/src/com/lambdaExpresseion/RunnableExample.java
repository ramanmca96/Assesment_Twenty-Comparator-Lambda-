package com.lambdaExpresseion;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("This is From Runnable Run Method");

	}

	public static void main(String[] args) {
		RunnableExample exam = new RunnableExample();
		Thread thread = new Thread(exam);
		thread.start();
	}

}

class LambdaRUnnable {
	public static void main(String[] args) {

		Runnable runner = () -> {
			System.out.println("This thread From Lambda Runnable running");
		};
		Thread thread = new Thread(runner);
		thread.start();
		System.out.println("Main thread is running");
	}
}
