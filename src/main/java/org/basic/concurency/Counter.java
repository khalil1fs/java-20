package org.basic.concurency;

public class Counter {

    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronize on the Counter object
            count++;
        }
    }

    public int getCount() {
        synchronized (this) { // Synchronize on the Counter object
            return count;
        }
    }

}
