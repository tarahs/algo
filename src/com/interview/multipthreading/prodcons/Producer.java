package com.interview.multipthreading.prodcons;

import java.util.Queue;

public class Producer implements Runnable {

    Queue queue;
    int counter;
    public Producer(Queue q){
        this.queue = q;
    }


    @Override
    public void run() {
        System.out.println("PRODUCER: THREAD IS STARTED.....");
        while(true){
            synchronized (queue){
                while(queue.size() >= 4){
                    System.out.println("PRODUCER: Queue is full, waiting for it to get space....");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("PRODUCER: Adding element to queue");
                System.out.println("ADDING: "+(++counter));
                queue.add(counter);
                queue.notify();
            }
        }

    }
}
