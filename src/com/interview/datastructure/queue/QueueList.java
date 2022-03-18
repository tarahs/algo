package com.interview.datastructure.queue;

public class QueueList {

    Node front;
    Node rear;

    public void enQuque( int i )
    {
        Node node = new Node(i);

        if( rear == null )
        {
            this.rear = node;
            this.front = node;
            return;
        }

        this.rear.next = node;
        rear = node;

    }

    public Node dequeue()
    {
        if( front == null )
            return null;
        Node temp = front;
        front = front.next;

        if( front == null )
            rear = null;

        return temp;
    }

    public void printQueue()
    {
        Node temp = front;
        while( temp != null )
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {

        int data;
        Node next = null;

        public Node( int data )
        {
            this.data = data;

        }
    }

}
