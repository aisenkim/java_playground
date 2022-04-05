package thread.thread1;

public class Main {
	public static void main(String[] args) {
		System.out.println("******************************************");

		// #1 method
		Thread anotherThread = new AnotherThread();
		anotherThread.start();

		// #2 method
		new Thread() {
			public void run() {
				System.out.println("ANONYMOUS CLASS");
			}
		}.start();

		// #2.1 method
		new Thread(() -> {
			System.out.println("Anonymous Class Using Lambda");
		}).start();

		// #3 method
		Thread runnableThread = new Thread(new MyRunnable());
		runnableThread.start();

		// #3.1 method
		Thread lambdaRunnable = new Thread(() -> System.out.println("Replacing MyRunnable with Lambda inside Thread class"));
		lambdaRunnable.start();

		// #4 method
		Thread overrideRunnable = new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println("OVERRIDE RUNNABLE");
				try {
					// can set timeout value to tell it to wait for that time or termination (which ever is faster)
//					anotherThread.join(2000); // wait for anotherThread to finish
					anotherThread.join();
					System.out.println("AnotherThread Terminated, or TimedOut. So I'm running again");
				} catch (InterruptedException e) {
					System.out.println("Couldn't wait. Interrupted");
				}
			}
		});
		overrideRunnable.start();

		// This will throw exception inside AnotherThread class
		//anotherThread.interrupt();



		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

	}
}
