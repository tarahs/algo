package com.interview.datastructure.lList;

import sun.awt.image.ImageWatched;

import java.util.PriorityQueue;
import java.util.Queue;

public class ListMain {

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();

		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(8);
		linkedList.append(11);
		linkedList.append(8);
		linkedList.append(15);

        LinkedList dummy1 = linkedList;
        dummy1.append(3);
        dummy1.append(4);
        dummy1.append(5);

        LinkedList dummy2 = dummy1;


        System.out.println(dummy1.head.nextNode.nextNode == dummy2.head.nextNode.nextNode);
        System.out.println(dummy1.head.nextNode.nextNode.equals(dummy2.head.nextNode.nextNode));

		LinkedList.Node node = linkedList.reverRec(linkedList.head, null);
        System.out.println(node);

//
//		linkedList.pushNode(2);
//
//		linkedList.pushNode(1);
//
//		linkedList.insertAfter(linkedList.head.nextNode, 3);

		linkedList.printAllElements();
		linkedList.getMidElement();
		linkedList.length();

		linkedList.head.nextNode.nextNode.nextNode = linkedList.head;

		//		linkedList.reverseList();
		//		linkedList.printAllElements();
		//
		//		System.out.println("Recursive length is " + linkedList.recursiveLength(linkedList.head));
				linkedList.findElementFromEnd(4);
		//
		//		linkedList.getMidElement();
		//
		//		linkedList.deleteNode(5);
		//		linkedList.deleteNodeAtPosition(1);
		//
		//		linkedList.printAllElements();
		//		linkedList.length();
		//		System.out.println("Recursive length is " + linkedList.recursiveLength(linkedList.head));

//        ListNode[] list = new ListNode[3];
//
//        ListNode node1 = new ListNode(1);
//        node1.next = new ListNode(2);
//        node1.next.next = new ListNode(8);
//
//        ListNode node2 = new ListNode(0);
//        node2.next = new ListNode(5);
//        node2.next.next = new ListNode(7);
//
//        ListNode node3 = new ListNode(4);
//        node3.next = new ListNode(6);
//        node3.next.next = new ListNode(9);
//
//        list[0] = node1;
//        list[1] = node2;
//        list[2] = node3;
//
//        mergeKLists(list);

	}

	static class ListNode{
	    int val;
	    ListNode next;

	    public ListNode(int val){
	        this.val = val;
	        next = null;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        if(lists == null || lists.length == 0) return null;
        Queue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for(ListNode node : lists){
            if(node != null) pq.offer(node);
        }
        while(!pq.isEmpty()){
            ListNode n = pq.poll();
            tail.next = n;
            tail = tail.next;
            if (tail.next != null){
                pq.offer(tail.next);
            }
        }
        return dummy.next;
    }

}
