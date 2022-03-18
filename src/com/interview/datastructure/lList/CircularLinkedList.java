package com.interview.datastructure.lList;

public class CircularLinkedList {

    Node first;

    public void traverse()
    {
        Node temp = first;
        if( first != null )
        {
            do
            {

                System.out.println(temp.data);
                temp = temp.next;

            } while( temp != first );

        }
    }

    public static void main( String[] args )
    {
        CircularLinkedList list = new CircularLinkedList();
        Node node1 = new Node();
        node1.data = 1;

        Node node2 = new Node();
        node2.data = 2;

        Node node3 = new Node();
        node3.data = 3;

        Node node4 = new Node();
        node4.data = 4;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        list.first = node1;

        list.traverse();

    }

}

class Node {

    int data;
    Node next;
}
