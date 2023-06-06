package org.basic.thread1;

public class FirstThreadProgram extends Thread {

    public FirstThreadProgram(String nameOfThread) {
        this.nameOfThread = nameOfThread;
    }
    private String nameOfThread;
//    Override the run method that exists on the Thread class
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println( nameOfThread + ": " + i);
            try {
                Thread.sleep(50); // Pause for 50 Msec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





}
