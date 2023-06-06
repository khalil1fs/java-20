package org.basic.concurency;

public class ConcurrencyExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads
        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
