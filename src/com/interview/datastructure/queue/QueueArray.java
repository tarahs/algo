package com.interview.datastructure.queue;

public class QueueArray {

	int size;
	int capacity;
	int front;
	int rear;
	int[] quereArray;

	public QueueArray( int capacity )
	{
		quereArray = new int[capacity];
		this.capacity = capacity;
		size = front = 0;
		rear = (capacity - 1);
	}

	public void enQueue( int element )
	{
		if( !isFull() )
		{
			rear = (rear + 1) % capacity;
			quereArray[rear] = element;
			size = size + 1;
		}
	}

	public int deQueue()
	{
		if( isEmpty() )
		{
			return -1;
		}
		int element = quereArray[front];
		front = (front + 1) % capacity;
		size = size - 1;
		return element;
	}

	public int front()
	{
		if( !isEmpty() )
			return quereArray[front];
		return -1;
	}

	public int rear()
	{
		if( !isEmpty() )
			return quereArray[rear];
		return -1;
	}

	public Boolean isFull()
	{
		return ( size == capacity );
	}

	public Boolean isEmpty() {
        return (size == 0);
    }

	public void printQueue()
	{
		for( int i = rear; i >= front; i-- )
		{
			System.out.println(quereArray[i] + "\t");
		}
	}

}
