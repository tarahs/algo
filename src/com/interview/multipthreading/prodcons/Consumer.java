package com.interview.multipthreading.prodcons;

import java.util.Queue;

public class Consumer implements Runnable {

    Queue queue;
    public Consumer(Queue q){
        this.queue = q;
    }


    @Override
    public void run() {
        System.out.println("CONSUMER: THREAD IS STARTED......");
        while(true){
            synchronized (queue){
                while(queue.size() == 0){
                    System.out.println("CONSUMER: Queue is Empty, waiting for it to get some elements");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Removing element from queue....");
                System.out.println("Removing: "+queue.remove());
                queue.notify();
            }
        }

    }
}

