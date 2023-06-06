package org.basic.thread2;

public class MainThread2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads
        SecondThreadProgram thread1 = new SecondThreadProgram(counter);
        SecondThreadProgram thread2 = new SecondThreadProgram(counter);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
