package com.interview.multipthreading.testthread;

class ThreadDemo1 extends Thread {

    Object Lock2, Lock1;
    public ThreadDemo1(Object ob1, Object ob2){
        Lock2 = ob2;
        Lock1 = ob1;
    }
    public void run() {
        synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (Lock2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}