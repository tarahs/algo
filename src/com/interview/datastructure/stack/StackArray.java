package com.interview.datastructure.stack;

public class StackArray {

    int size;
    int top = -1;
    int[] stackArray;

    public StackArray( int size )
    {
        this.size = size;
        stackArray = new int[size];
    }

    public void push( int element )
    {
        if( top >= size - 1 )
        {
            System.out.println("Cannot insert the number " + element + " , Stack is full");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];

    }

    public int peak()
    {
        return stackArray[top];
    }

    public Boolean isFull()
    {
       return top >= (size - 1);

    }

    public Boolean isEmpty()
    {
        if( top == -1 )
            return true;
        else
            return false;
    }

    public void printStack()
    {

        for( int i = 0; i <= top; i++ )
        {
            System.out.print(stackArray[i] + "\t");
        }

    }

}
