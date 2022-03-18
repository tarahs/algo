package com.interview.datastructure.lList;

import java.util.List;

/**
 * Adva Linear Data Strcuture Items are not stored in a contigeous Location unlike Arrays Dynamic
 * Sizing Easy Insertiong and Deletion
 * 
 * @author tara
 *
 *         Cos Random Access is not allowed -- Iterate the list from Beggining so we can't do binary
 *         search on a linked list Extra memory for a pointer is required
 *
 */
public class LinkedList {

    Node head;

    public LinkedList(){}
    public LinkedList(Node head)
    {
        this.head = head;
    }

    public Node getHead()
    {
        return head;
    }

    public class Node {

        Node nextNode;
        int data;

        public Node( int data )
        {
            this.data = data;
            nextNode = null;
        }

        /**
         * @return the node
         */
        public Node getNextNode()
        {
            return nextNode;
        }

        /**
         * @param node
         *            the node to set
         */
        public void setNextNode( Node node )
        {
            this.nextNode = node;
        }

        /**
         * @return the data
         */
        public int getData()
        {
            return data;
        }

        /**
         * @param data
         *            the data to set
         */
        public void setData( int data )
        {
            this.data = data;
        }

    }

    //Add Elements in the Front
    public void pushNode( int data )
    {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    //Print all the elements of Linked List
    public void printAllElements()
    {

        Node currentNode = head;
        if( currentNode == null )
            System.out.println("List is Empty");

        while( currentNode != null )
        {
            System.out.print(currentNode.getData() + "\t");
            currentNode = currentNode.getNextNode();

        }
    }

    //Add Node at the end
    public void append( int data )
    {
        Node currentNode = head;
        Node newNode = new Node(data);
        if( currentNode == null )
        {
            head = newNode;
            return;
        }

        while( currentNode.getNextNode() != null )
        {
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);

    }

    public void insertAfter( Node prevNode, int data )
    {
        if( prevNode == null )
            System.out.println("There is no Prev Node specified");

        Node newNode = new Node(data);
        newNode.nextNode = prevNode.nextNode;
        prevNode.nextNode = newNode;
    }

    public void deleteNode( int key )
    {
        Node currentNode = head;
        if( currentNode == null )
        {
            System.out.println("List is empty");
            return;
        }

        Node previousNode = null;
        while( currentNode != null )
        {
            if( currentNode.data == key )
            {
                if( previousNode != null )
                {
                    previousNode.nextNode = currentNode.nextNode;
                }
                else
                {
                    head = currentNode.nextNode;
                }
                return;

            }
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        System.out.println("Key not found in the list");
    }

    public void deleteNodeAtPosition( int position )
    {
        Node current = head;
        int length = 0;
        Node prev = null;
        if( position <= 0 )
        {
            System.out.println("Please enter a valid position which is greater than 0");
        }

        while( current != null )
        {
            length++;
            if( length == position )
            {
                if( prev != null )
                {
                    prev.nextNode = current.nextNode;
                }
                else
                {
                    head = current.nextNode;
                }
                return;
            }

            current = current.nextNode;
            prev = current;

        }

        System.out.println("Position not Found");

    }

    public void length()
    {

        Node current = head;
        int length = 0;
        while( current != null )
        {
            length++;
            current = current.nextNode;
        }

        System.out.println("length is " + length);
    }

    public int recursiveLength( Node currentNode )
    {
        if( currentNode == null )
            return 0;

        return 1 + recursiveLength(currentNode.nextNode);
    }

    public void getMidElement()
    {
        Node currentNode = head;
        Node mid = head;
        int size = 0;
        while( currentNode != null )
        {
            size++;
            if( size!=1 && size % 2 != 0 )
                mid = mid.nextNode;

            currentNode = currentNode.nextNode;
        }

        if( mid == null )
        {
            System.out.println("Mid element is not found");
        }
        else
            System.out.println("Mid element is " + mid.getData());
    }


    public void getMidElement1(){
        Node currentNode = head;
        Node mid = head;

        if(currentNode == null){
            System.out.println("Sorry the list is empty!");
        }

        while(currentNode.nextNode!= null){
            if(currentNode.nextNode.nextNode == null)
                break;
            mid = mid.nextNode;
            currentNode = currentNode.nextNode.nextNode;
        }
        if( mid == null )
        {
            System.out.println("Mid element is not found");
        }
        else
            System.out.println("Mid element is " + mid.getData());
    }

    public void findElementFromEnd( int n )
    {
        Node firstNode = head;
        Node secNode = head;

        if( firstNode == null || n <= 0 )
        {
            System.out.println("List is empty");
            return;
        }

        int count = 0;
        while(firstNode != null){
            firstNode = firstNode.getNextNode();

            if(count >= n){
                secNode = secNode.getNextNode();
            }
            count++;
        }

        if(secNode == null)
            System.out.println("Invalid Position");

        System.out.println(n + "th element from end is " + secNode.getData());
    }

    public void deleteList()
    {
        head = null;
    }

    // 1 ->2-> 5-> 6-> 7->null
    /**
     * prev = null current =1 next = null
     * 
     * 1->null prev = 1; current = 2
     * 
     * 2->1->null
     */

    public void reverseList()
    {
        Node current = head;
        Node prev = null;
        Node next = null;

        while( current != null )
        {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;

        }
        head = prev;

    }

    public Node reverRec(Node cur, Node prev){
        if(cur.nextNode == null){
            head = cur;
            cur.nextNode = prev;
            return head;
        }
        Node next = cur.nextNode;
        cur.nextNode = prev;
        return reverRec(next, cur);
    }

    public boolean isContainsLoop()
    {
        Node fNode = head;
        Node lNode = head;

        while( fNode != null && lNode != null && fNode.nextNode != null )
        {
            lNode = lNode.nextNode;
            fNode = fNode.nextNode.nextNode;

            if( fNode == lNode )
            {
                System.out.println("true");
                return true;

            }

        }
        System.out.println("false");
        return false;

    }

    public int deleteFromFirst()
    {
        if( head == null )
            return -1;

        int deletedEle = head.data;
        head = head.nextNode;
        return deletedEle;

    }

    public void insertAtPosition( int position, int data )
    {
        Node current = head;
        Node newNode = new Node(data);

        if( position == 1 )
        {
            if( head != null )
            {
                newNode.nextNode = head;
                head = newNode;
            }
            return;
        }

        int length = 0;
        while( current.nextNode != null )
        {
            length++;
            if( length == position )
            {
                newNode.nextNode = current.nextNode;
                current.nextNode = newNode;
            }

        }
    }

    boolean CompareLists( Node headA, Node headB )
    {
        // This is a "method-only" submission. 
        // You only need to complete this method 
        while( headA != null && headB != null )
        {
            if( headA.data != headB.data )
            {
                return false;
            }
            headA = headA.nextNode;
            headB = headB.nextNode;
        }
        return( headA == null && headB == null );
    }

    Node MergeLists( Node headA, Node headB )
    {

        Node temp = new Node(0);
        Node node = temp;
        while( headA != null && headB != null )
        {
            if( headA.data < headB.data )
            {
                node.nextNode = headA;
                headA = headA.nextNode;
            }
            else
            {
                node.nextNode = headB;
                headB = headB.nextNode;
            }
            node = node.nextNode;
        }

        if( headA != null )
            node.nextNode = headA;

        if( headB != null )
            node.nextNode = headB;

        return temp.nextNode;

    }

    Node mergeListRec(Node headA, Node headB){
        if(headA == null)
            return headB;
        if(headB == null)
            return headA;

        if(headA.data < headB.data){
            headA.nextNode = mergeListRec(headA.nextNode, headB);
            return headA;
        }else {
            headB.nextNode = mergeListRec(headB.nextNode, headA);
            return headB;
        }

    }
}
