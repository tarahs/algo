package com.interview.datastructure.queue;

public class QueueMain {

    public static void main( String[] args )
    {
        // TODO Auto-generated method stub
        QueueArray queue = new QueueArray(6);
        queue.enQueue(6);
        queue.enQueue(6);
        queue.enQueue(5);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(2);

        queue.printQueue();
        System.out.println("\n");
        queue.deQueue();
        queue.printQueue();

        System.out.println("\n Front item is " + queue.front());
        System.out.println("\n Rear item is " + queue.rear);

        System.out.println("\nQueue using LinkedList...........");
        QueueList queue1 = new QueueList();
        queue1.enQuque(1);
        queue1.enQuque(2);
        queue1.enQuque(3);
        queue1.enQuque(4);
        queue1.enQuque(5);

        System.out.println("before dequequing");
        queue1.printQueue();

        queue1.dequeue();
        queue1.dequeue();

        System.out.println("After dequeuing");
        queue1.printQueue();

    }

}
