package org.basic.thread2;

public class SecondThreadProgram extends Thread{
    private Counter counter;

    public SecondThreadProgram(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
            System.out.println("Thread: " + i + ", Count: " + counter.getCount());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
