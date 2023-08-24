package Mutithreading;

public class InterThreadCommunication {

    public static class ThreadA implements Runnable {
        int total = 0;

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("Child Thread has started Running.. " + Thread.currentThread().getName());
                for (int i = 0; i < 100; i++) {
                    total += i;
                }
                System.out.println("Child Thread execution has been completed.. " + Thread.currentThread().getName());
                this.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadA runnable = new ThreadA();
        Thread thread = new Thread(runnable, "Thread-A");
        thread.start();
        System.out.println("Main Thread has started running.. " + Thread.currentThread().getName());
        synchronized (thread) {
            thread.wait();
            System.out.println("Total = " + runnable.total);
        }
    }
}
