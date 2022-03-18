package com.interview.multipthreading.testthread;

class ThreadDemo2 extends Thread {

    Object Lock2, Lock1;
    public ThreadDemo2(Object ob1, Object ob2){
        Lock2 = ob2;
        Lock1 = ob1;
    }
    public void run() {
        synchronized (Lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }
}
