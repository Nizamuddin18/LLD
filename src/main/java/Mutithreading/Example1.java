package Mutithreading;

public class Example1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "Thread Running..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "Thread Completed..");
        };
        Thread thread = new Thread(runnable, "Custom-1 ");
        thread.start();
    }

}
