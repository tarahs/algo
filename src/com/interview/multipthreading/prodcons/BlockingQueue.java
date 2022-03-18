package com.interview.multipthreading.prodcons;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    public static void main(String[] args){

        Queue queue = new LinkedList();

        Thread producerT = new Thread(new Producer(queue));
        Thread consumerT = new Thread(new Consumer(queue));
        producerT.start();
        consumerT.start();
    }
}
