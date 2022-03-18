package com.interview.datastructure.stack;

public class StackLinkedlist {

    Node first;

    class Node {

        int data;
        Node next = null;

        Node( int data )
        {
            this.data = data;

        }
    }

    public void push( int data )
    {
        Node node = new Node(data);
        if( first == null )
        {
            first = node;
            return;
        }

        node.next = first;
        first = node;
    }

    public int pop()
    {
        if( first == null )
            return -1;
        int toBepopped = first.data;
        first = first.next;
        System.out.println(toBepopped);
        return toBepopped;
    }

    public void print()
    {
        if( first == null )
            System.out.println(first);

        while( first != null )
        {
            System.out.println(first.data);
            first = first.next;
        }
    }

}
