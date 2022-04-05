package thread.thread1;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("ANOTHER THREAD CLASS");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
			// when another thread interupts, it will wake it up
            System.out.println("Another Thread Woke It Up");
			return; // terminate the instance immediately
        }

		System.out.println("3 seconds past");
    }
}
