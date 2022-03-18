package com.interview.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deepak on 4/24/19.
 * Idea is to store the data in a doubly Linked List and Move the most recently used to head of the list
 * and while removing remove the elements from the tail
 */
public class LRUCache {

    Map<Integer, Node> cache = new HashMap<>();
    int capacity = 0;
    int size = 0;
    Node head,tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    class Node{
        int key;
        int value;
        Node next;
        Node prev;
    }

    public void add(Node node){

        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;

    }

    public void moveToHead(Node node){
        delete(node);
        add(node);
    }

    public void delete(Node node){
        Node next = node.next;
        node.prev.next = next;
        next.prev = node.prev;
    }

    public Node pollTail(){
        Node res = tail.prev;
        delete(res);
        return res;
    }

    public void put(int key, int val){
        Node node = cache.get(key);
        if(node == null){
            node = new Node();
            node.key = key;
            node.value = val;
            cache.put(key, node);
            size++;

            if(size > capacity){
                Node tail = pollTail();
                cache.remove(tail.key);
                size--;
            }
            add(node);
        }else{
            node.value = val;
            moveToHead(node);
        }

    }

    public Integer get(Integer key){
        Node node = cache.get(key);
        if(node == null)
            return -1;

        moveToHead(node);
        return node.value;
    }







}
