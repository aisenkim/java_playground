package thread.race_condition;

public class Main {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        Thread thread1 = new Thread(new CountDownThread(countDown));
        thread1.setName("THREAD--- #1");
        Thread thread2 = new Thread(new CountDownThread(countDown));
        thread2.setName("THREAD--- #2");
        thread1.start();
        thread2.start();
    }
}

class CountDown {

    // if sharing a instance variable (STORED IN HEAP) ... Race condition occurs
    int i;
    public void doCountDown() {
        synchronized (this) {
            for(i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

}

class CountDownThread implements Runnable{
    private final CountDown threadCountDown;

    public CountDownThread(CountDown countDown) {
        this.threadCountDown = countDown;
    }

   @Override
   public void run() {
        threadCountDown.doCountDown();
   }
}
