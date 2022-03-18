package com.interview.datastructure.stack;

public class StackMain {

    public static void main( String[] args )
    {
        // TODO Auto-generated method stub
        //		StackArray arrayStack = new StackArray(5);
        //		arrayStack.push(1);
        //		arrayStack.push(2);
        //		arrayStack.push(3);
        //		arrayStack.push(4);
        //		arrayStack.push(5);
        //		arrayStack.push(6);
        //		arrayStack.printStack();
        //
        //		arrayStack.pop();
        //		arrayStack.printStack();

        System.out.println("\n Linked List \n");
        StackLinkedlist sl = new StackLinkedlist();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.push(5);
        sl.push(6);
        System.out.println("\nPopped items \n");
        sl.pop();
        sl.pop();
        sl.pop();
        System.out.println("\nRemaining items \n");
        sl.print();

    }

}
