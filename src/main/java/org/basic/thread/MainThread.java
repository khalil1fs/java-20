package org.basic.thread;

public class MainThread {
    public static void main(String[] args) {

        FirstThreadProgram thread = new FirstThreadProgram("THREAD 2");
        thread.start();

        FirstThreadProgram thread2 = new FirstThreadProgram("THREAD 1");
        thread2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main function: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
