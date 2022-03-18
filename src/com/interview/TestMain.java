package com.interview;

import java.util.*;

/**
 * Created by tara on 2/7/17.
 */
public class TestMain {

    public static void main(String[] args){
        Random ran = new Random();
        int[] array = new int[]{1,2,4};
        array[2] = 3;
        System.out.println(array.length);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();


    }
}

class DLinkedList{
    int key;
    int value;
    DLinkedList prev;
    DLinkedList next;

    public void put(int key, int value){

    }

}
